/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： TeacherServiceImpl.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import tao.courseDesign.mapper.TeacherMapper;
import tao.courseDesign.DO.Teacher;
import tao.courseDesign.service.TeacherService;

/**
 * @Author: Tao
 * @Time: 2020/12/25 11:44
 * @ProjectName：course-design
 * @FileName: TeacherServiceImpl.java
 * @IDE: IntelliJ IDEA
 */

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

}


