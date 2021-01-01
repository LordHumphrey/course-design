/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： AdminController.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @GetMapping("index")
    public String adminIndex() {
        return "admin/index";
    }

    @GetMapping("add-news")
    public String addNews() {
        return "admin/addnews";
    }

    @GetMapping("start")
    public String start() {
        return "admin/starter";
    }

    @GetMapping("list-news")
    public String listnews() {
        return "admin/listnews";
    }


}
