/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： AdminRestController.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tao.courseDesign.DO.News;
import tao.courseDesign.DO.Teacher;
import tao.courseDesign.DTO.NewsDTO;
import tao.courseDesign.DTO.TeacherDTO;
import tao.courseDesign.common.exceptionHandler.ResponseException;
import tao.courseDesign.common.mapStruct.NewsDoConvertToDTO;
import tao.courseDesign.common.mapStruct.TeacherDoConvertToDTO;
import tao.courseDesign.common.responseEncapsulation.ResponseEncapsulationAnnotation;
import tao.courseDesign.common.responseEncapsulation.ResponseStatusCode;
import tao.courseDesign.common.utils.DelTagsUtil;
import tao.courseDesign.service.impl.NewsServiceImpl;
import tao.courseDesign.service.impl.TeacherServiceImpl;

import java.util.List;

/**
 * @Author: Tao
 * @Time: 2020/12/20 19:47
 * @ProjectName：course-design
 * @FileName: AdminRestController.java
 * @IDE: IntelliJ IDEA
 */
@Slf4j
@ResponseEncapsulationAnnotation
@RestController
@RequestMapping("admin/api")
public class AdminRestController {
    @Autowired
    private NewsServiceImpl newsServiceImpl;

    @Autowired
    private NewsDoConvertToDTO newsDoConvertToDTO;

    @Autowired
    private TeacherServiceImpl teacherServiceImpl;

    @Autowired
    private TeacherDoConvertToDTO teacherDoConvertToDTO;


    @PostMapping("addNews")
    public String addNews(@RequestBody NewsDTO newDTO) throws ResponseException {
        if (newDTO.getTitle().isEmpty()) {
            throw new ResponseException("标题不能为空", ResponseStatusCode.BAD_REQUEST);
        } else if (newDTO.getContent().isEmpty()) {
            throw new ResponseException("内容不能为空", ResponseStatusCode.BAD_REQUEST);

        } else {
            News news = newsDoConvertToDTO.news(newDTO);
            news.setContent(DelTagsUtil.getTextFromHtml(news.getContent()));
            newsServiceImpl.saveOrUpdate(news, new QueryWrapper<News>().eq("title", news.getTitle()));
        }
        return "index";
    }

    @GetMapping("list-news")
    public List<News> listNews() {
        return newsServiceImpl.list(new QueryWrapper<>());
    }

    @DeleteMapping("delete-news")
    public String deleteNews(@RequestParam Integer id) {

        return newsServiceImpl.removeById(id) ? "删除成功" : "删除失败";
    }

    @GetMapping("list-teachers")
    public List<Teacher> listTeacher(@RequestParam(defaultValue = "") String professionalTitle) {
        return teacherServiceImpl.list(new QueryWrapper<Teacher>().eq("professional_title", professionalTitle));
    }

    @PostMapping("add-teacher")
    public String addTeacher(@RequestBody TeacherDTO teacherDTO) {
        Teacher teacher = teacherDoConvertToDTO.teacher(teacherDTO);
        return teacherServiceImpl.save(teacher) ? "添加成功" : "添加失败";

    }
}
