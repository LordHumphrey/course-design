/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： Teacher.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.DO;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


/**
 * @Author: Tao
 * @Time: 2020/12/30 12:32
 * @ProjectName：course-design
 * @FileName: Teacher.java
 * @IDE: IntelliJ IDEA
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "teacher")
public class Teacher {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 教师姓名
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 教师简介
     */
    @TableField(value = "note")
    private String note;

    /**
     * 用户性别
     */
    @TableField(value = "gender")
    private String gender;

    /**
     * 教师职称
     */
    @TableField(value = "professional_title")
    private String professionalTitle;

    /**
     * 发表论文
     */
    @TableField(value = "paper")
    private String paper;

    /**
     * 研究方向
     */
    @TableField(value = "research_direction")
    private String researchDirection;

    /**
     * 教育背景
     */
    @TableField(value = "education_background")
    private String educationBackground;

    /**
     * 教师邮箱
     */
    @TableField(value = "email")
    private String email;

    @TableField(value = "pic")
    private String pic;

    @TableLogic
    @TableField(value = "isDeleted")
    private Boolean isdeleted;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "gmt_created", fill = FieldFill.INSERT)
    private LocalDateTime gmtCreated;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "gmt_modified", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtModified;
}