/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： TeacherDoConvertToDTO.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.common.mapStruct;

import org.mapstruct.Mapper;
import tao.courseDesign.DO.Teacher;
import tao.courseDesign.DTO.TeacherDTO;

/**
 * @Author: Tao
 * @Time: 2020/12/25 11:54
 * @ProjectName：course-design
 * @FileName: TeacherDoConvertToDTO.java
 * @IDE: IntelliJ IDEA
 */

@Mapper(componentModel = "spring")
public interface TeacherDoConvertToDTO {
    /**
     * teacher
     * @param teacherDTO teacherDTO
     * @return teacher
     */
    Teacher teacher(TeacherDTO teacherDTO);
}
