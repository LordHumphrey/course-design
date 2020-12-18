package tao.courseDesign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Tao
 * @Time: 2020/12/15 15:04
 * @ProjectName：course-design
 * @FileName: IndexController.java
 * @IDE: IntelliJ IDEA
 */
@Controller
@RequestMapping(value = {"", "/"})
public class IndexController {
    @GetMapping(value = {"", "/"})
    public String index() {
        return "index";
    }
}
