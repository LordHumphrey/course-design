/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： TeacherServiceImplTest.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.service.impl;

import com.apifan.common.random.source.InternetSource;
import com.apifan.common.random.source.NumberSource;
import com.apifan.common.random.source.OtherSource;
import com.apifan.common.random.source.PersonInfoSource;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tao.courseDesign.DO.Teacher;
import tao.courseDesign.mapper.TeacherMapper;

import java.io.IOException;

/**
 * @Author: Tao
 * @Time: 2020/12/25 11:20
 * @ProjectName：course-design
 * @FileName: TeacherServiceImplTest.java
 * @IDE: IntelliJ IDEA
 */
@SpringBootTest
class TeacherServiceImplTest {

    @Autowired
    TeacherServiceImpl teacherServiceImpl;

    @Autowired
    TeacherMapper teacherMapper;

    @Test
    void listTeacherWithPage() {
        Page<Teacher> page = teacherServiceImpl.page(new Page<>(1, 2));
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getRecords());
    }

    @Test
    void insertTeacher() throws IOException {
        PersonInfoSource personInfoSource = PersonInfoSource.getInstance();
        InternetSource internetSource = InternetSource.getInstance();

        String s = "src/main/resources/static/pic/";
        for (int i = 0; i < 10; i++) {
            String name = personInfoSource.randomMaleChineseName();
            String targetPath = s + name + ".png";
            personInfoSource.generateNamePicture(name, targetPath);
            Teacher teacher = Teacher.builder().name(name).gender("男").professionalTitle(NumberSource.getInstance().randomInt(1, 3) == 1 ? "教授" : "副教授").note(OtherSource.getInstance().randomChineseSentence()).email(internetSource.randomEmail(10, "163.com")).pic(targetPath.replace("src/main/resources/", "")).build();
            teacherServiceImpl.save(teacher);
        }
        for (int i = 0; i < 10; i++) {
            String name = personInfoSource.randomMaleChineseName();
            String targetPath = s + name + ".png";
            personInfoSource.generateNamePicture(name, targetPath);
            Teacher teacher = Teacher.builder().name(personInfoSource.randomFemaleChineseName()).gender("女").professionalTitle(NumberSource.getInstance().randomInt(1, 3) == 1 ? "教授" : "副教授").email(internetSource.randomEmail(10, "163.com")).pic(targetPath.replace("src/main/resources/", "")).note(OtherSource.getInstance().randomChineseSentence()).build();
            teacherServiceImpl.save(teacher);
        }
        for (int i = 0; i < 10; i++) {
            String name = personInfoSource.randomMaleChineseName();
            String targetPath = s + name + ".png";
            personInfoSource.generateNamePicture(name, targetPath);
            Teacher teacher = Teacher.builder().name(personInfoSource.randomMaleChineseName()).gender("男").professionalTitle("讲师").email(internetSource.randomEmail(10, "163.com")).pic(targetPath.replace("src/main/resources/", "")).note(OtherSource.getInstance().randomChineseSentence()).build();
            teacherServiceImpl.save(teacher);
        }
        for (int i = 0; i < 10; i++) {
            String name = personInfoSource.randomMaleChineseName();
            String targetPath = s + name + ".png";
            personInfoSource.generateNamePicture(name, targetPath);
            Teacher teacher = Teacher.builder().name(personInfoSource.randomFemaleChineseName()).gender("女").professionalTitle("讲师").email(internetSource.randomEmail(10, "163.com")).pic(targetPath.replace("src/main/resources/", "")).note(OtherSource.getInstance().randomChineseSentence()).build();
            teacherServiceImpl.save(teacher);
        }
    }
}