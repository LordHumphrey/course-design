/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： TeacherMapper.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import tao.courseDesign.DO.Teacher;


/**
 * @Author: Tao
 * @Time: 2020/12/25 12:09
 * @ProjectName：course-design
 * @FileName: TeacherMapper.java
 * @IDE: IntelliJ IDEA
 */

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
}