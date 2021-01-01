/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： PageDTOTest.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.DTO;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tao.courseDesign.DO.Teacher;
import tao.courseDesign.service.impl.TeacherServiceImpl;

/**
 * @Author: Tao
 * @Time: 2020/12/25 17:14
 * @ProjectName：course-design
 * @FileName: PageDTOTest.java
 * @IDE: IntelliJ IDEA
 */
@SpringBootTest
class PageDTOTest {
    @Autowired
    TeacherServiceImpl teacherServiceImpl;
    @Test
    void testPage() {
        Page<Teacher> page = teacherServiceImpl.page(new Page<>(1, 2));
        PageDTO<Teacher> pageDTO = new PageDTO<>(page);
        System.out.println(pageDTO.toString());
    }
}