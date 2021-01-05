/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： IndexRestController.java
 * 2021-1-5 - create by Tao.
 *
 */

package tao.courseDesign.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tao.courseDesign.DO.Teacher;
import tao.courseDesign.common.responseEncapsulation.ResponseEncapsulationAnnotation;
import tao.courseDesign.service.impl.TeacherServiceImpl;

import java.util.List;

/**
 * @Author: Tao
 * @Time: 2020/12/29 10:40
 * @ProjectName：course-design
 * @FileName: IndexRestController.java
 * @IDE: IntelliJ IDEA
 */
@RestController
@ResponseEncapsulationAnnotation
@RequestMapping("home/api")
public class IndexRestController {
    @Autowired
    private TeacherServiceImpl teacherServiceImpl;


    @GetMapping("search-teacher")
    public List<Teacher> search(@RequestParam(defaultValue = "") String name, @RequestParam(defaultValue = "") String professionalTitle, @RequestParam(defaultValue = "", value = "sex") String gender) {
        QueryWrapper<Teacher> teacherQueryWrapper = new QueryWrapper<>();
        teacherQueryWrapper.eq(!("all".equals(professionalTitle)), "professional_title", professionalTitle).like(!("".equals(name)), "name", name).eq(!("".equals(gender)), "gender", gender);
        return teacherServiceImpl.list(teacherQueryWrapper);
    }
}