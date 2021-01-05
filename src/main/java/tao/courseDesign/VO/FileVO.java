/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： FileVO.java
 * 2021-1-5 - create by Tao.
 *
 */

package tao.courseDesign.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author Tao
 */
@Data
@AllArgsConstructor
@Builder
public class FileVO {
    String errno;
    List<String> data;
}
