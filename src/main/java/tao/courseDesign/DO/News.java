/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： News.java
 * 2021-1-5 - create by Tao.
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
 * 新闻表
 *
 * @author Tao
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "news")
public class News {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 新闻标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 新闻内容
     */
    @TableField(value = "content")
    private String content;

    @TableField(value = "pic")
    private String pic;

    /**
     * 创建时间
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "gmt_created", fill = FieldFill.INSERT)
    private LocalDateTime gmtCreated;

    /**
     * 修改时间
     */
    @TableField(value = "gmt_modified", fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gmtModified;


    @TableLogic
    @TableField(value = "isDeleted")
    private Boolean isDeleted;

}