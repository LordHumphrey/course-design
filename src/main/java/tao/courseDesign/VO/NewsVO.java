/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： NewsVO.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 新闻表
 *
 * @author Tao
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewsVO {
    private Integer id;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻内容
     */
    private String content;

    /**
     * 修改时间
     */
    private String gmtModified;

}