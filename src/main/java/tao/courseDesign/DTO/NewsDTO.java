/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： NewsDTO.java
 * 2021-1-5 - create by Tao.
 *
 */

package tao.courseDesign.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Tao
 * @Time: 2020/12/23 18:59
 * @ProjectName：course-design
 * @FileName: NewsDTO.java
 * @IDE: IntelliJ IDEA
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewsDTO {
    String pic;
    String title;
    String content;
}
