/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： NewsMapper.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import tao.courseDesign.DO.News;


/**
 * @Author: Tao
 * @Time: 2020/12/21 20:51
 * @ProjectName：course-design
 * @FileName: NewsMapper.java
 * @IDE: IntelliJ IDEA
 */

@Mapper
public interface NewsMapper extends BaseMapper<News> {
}