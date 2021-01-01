/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： TeacherDTO.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Tao
 * @Time: 2020/12/25 11:49
 * @ProjectName：course-design
 * @FileName: TeacherDTO.java
 * @IDE: IntelliJ IDEA
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherDTO {
    private String name;
    private String note;
    private String gender;
    private String professionalTitle;
}
