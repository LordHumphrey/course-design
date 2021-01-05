/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： AdminController.java
 * 2021-1-5 - create by Tao.
 *
 */

package tao.courseDesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tao.courseDesign.DO.News;
import tao.courseDesign.DO.Teacher;
import tao.courseDesign.service.impl.NewsServiceImpl;
import tao.courseDesign.service.impl.TeacherServiceImpl;

import java.util.List;

/**
 * @Author: Tao
 * @Time: 2020/12/20 15:57
 * @ProjectName：course-design
 * @FileName: AdminController.java
 * @IDE: IntelliJ IDEA
 */

@Controller
@RequestMapping(value = {"admin"})
public class AdminController {

    @Autowired
    private TeacherServiceImpl teacherServiceImpl;

    @Autowired
    private NewsServiceImpl newsServiceImpl;

    @GetMapping(value = {"index", ""})
    public String adminIndex(Model model) {
        model.addAttribute("activeMain", "news");
        model.addAttribute("activeSub", "listnews");
        return "admin/listnews";
    }

    @GetMapping("add-news")
    public String addNews(Model model) {
        model.addAttribute("activeMain", "news");
        model.addAttribute("activeSub", "addnews");
        return "admin/addnews";
    }

    @GetMapping("list-news")
    public String listnews(Model model) {
        model.addAttribute("activeMain", "news");
        model.addAttribute("activeSub", "listnews");
        return "admin/listnews";
    }

    @GetMapping("teachers")
    public String teachers(Model model) {
        List<Teacher> teacherList = teacherServiceImpl.list();
        model.addAttribute(teacherList);
        model.addAttribute("activeMain", "teachers");
        model.addAttribute("activeSub", "teachers");
        return "admin/teachers";
    }

    @GetMapping("modifyNews")
    public String modifyNews(Model model, @RequestParam(value = "id") String id) {
        News news = newsServiceImpl.getById(Integer.parseInt(id));
        model.addAttribute(news);
        return "admin/modifyNews";
    }

//    @GetMapping("login")
//    public String login() {
//        return "admin/login";
//    }

//    @GetMapping("login/form")
//    public String loginForm() {
//        return "redirect::/admin/list-news";
//    }

}
