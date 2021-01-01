/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： NewsDoConvertToDTO.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.common.mapStruct;


import org.mapstruct.Mapper;
import tao.courseDesign.DO.News;
import tao.courseDesign.DTO.NewsDTO;

/**
 * @Author: Tao
 * @Time: 2020/12/23 19:03
 * @ProjectName：course-design
 * @FileName: NewsDoConvertToDTO.java
 * @IDE: IntelliJ IDEA
 */
@Mapper(componentModel = "spring")
public interface NewsDoConvertToDTO {
    /**
     * 转换方法
     *
     * @param newsDTO newsDTO 对象
     * @return NewsDO
     */
    News news(NewsDTO newsDTO);

}
