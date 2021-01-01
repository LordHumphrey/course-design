/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： IndexController.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tao.courseDesign.DO.News;
import tao.courseDesign.DO.Teacher;
import tao.courseDesign.VO.NewsVO;
import tao.courseDesign.common.mapStruct.NewsDoConvertToVO;
import tao.courseDesign.service.impl.NewsServiceImpl;
import tao.courseDesign.service.impl.TeacherServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Tao
 * @Time: 2020/12/15 15:04
 * @ProjectName：course-design
 * @FileName: IndexController.java
 * @IDE: IntelliJ IDEA
 */
@Slf4j
@Controller
@RequestMapping(value = {""})
public class IndexController {
    @Autowired
    private TeacherServiceImpl teacherServiceImpl;
    @Autowired
    private NewsServiceImpl newsServiceImpl;
    @Autowired
    private NewsDoConvertToVO newsDoConvertToVO;

    @GetMapping(value = {"", "index"})
    public String index(Model model) {
        List<News> newsList = newsServiceImpl.list();
        List<NewsVO> newsVOList = new ArrayList<>(100);
        for (News news : newsList) {
            NewsVO newsVO = newsDoConvertToVO.newsToVO(news);
            newsVOList.add(newsVO);
        }
        model.addAttribute(newsVOList);
        return "index";
    }

    @GetMapping(value = {"teachers"})
    public String teacher() {
        return "teacher";
    }


    @GetMapping("teacher-search")
    public String searchTeachers(@RequestParam(defaultValue = "", name = "name") String name, @RequestParam(defaultValue = "", name = "jobtitle") String professionalTitle, @RequestParam(defaultValue = "", name = "sex") String gender, @RequestParam(defaultValue = "") String btnSubmit, Model model) {
        QueryWrapper<Teacher> teacherQueryWrapper = new QueryWrapper<>();
        teacherQueryWrapper.eq(!("".equals(professionalTitle)), "professional_title", professionalTitle).like(!("".equals(name)), "name", name).eq(!("".equals(gender)), "gender", gender);
        List<Teacher> teacherList = teacherServiceImpl.list(teacherQueryWrapper);
        model.addAttribute(teacherList);
        return "teacher-search";
    }

    @GetMapping("teacher-detail")
    public String teacherDetail(Model model, @RequestParam(defaultValue = "", name = "id") String id) {
        if (!("".equals(id))) {
            Teacher teacherServiceImplOne = teacherServiceImpl.getById(id);
            model.addAttribute(teacherServiceImplOne);
        }
        return "teacher_detail";
    }

    @GetMapping("news-detail")
    public String newsDetail(@RequestParam(name = "id") String id, Model model) {
        News news = newsServiceImpl.getById(Integer.parseInt(id));
        NewsVO newsVO = newsDoConvertToVO.newsToVO(news);
        model.addAttribute(newsVO);
        return "news-detail";

    }

    @GetMapping("923")
    public String laboratory923(){
        return "923-detail";
    }

    @GetMapping("925")
    public String laboratory925(){
        return "925-detail";
    }
}
