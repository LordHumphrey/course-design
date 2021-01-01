/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： NewsDoConvertToVO.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.common.mapStruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tao.courseDesign.DO.News;
import tao.courseDesign.VO.NewsVO;

/**
 * @author Tao
 */

@Mapper(componentModel = "spring")
public interface NewsDoConvertToVO {
    /**
     * 转换成VO
     *
     * @param news DO
     * @return VO
     */
    @Mapping(target = "gmtModified", source = "news.gmtModified", dateFormat = "MM-dd")
    NewsVO newsToVO(News news);
}
