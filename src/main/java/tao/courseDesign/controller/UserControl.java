/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： UserControl.java
 * 2021-1-5 - create by Tao.
 *
 */

package tao.courseDesign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserControl {
    @RequestMapping("login")
    public String login(Model model) {
        return "login";
    }
}
