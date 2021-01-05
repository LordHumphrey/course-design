/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： ListNewsVO.java
 * 2021-1-5 - create by Tao.
 *
 */

package tao.courseDesign.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tao
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListNewsVO {
    private Integer id;

    /**
     * 新闻标题
     */
    private String title;

    String pic;

    /**
     * 新闻内容
     */
    private String content;

    /**
     * 修改时间
     */
    private String gmtModified;
}
