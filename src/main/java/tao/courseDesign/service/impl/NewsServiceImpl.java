/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： NewsServiceImpl.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import tao.courseDesign.DO.News;
import tao.courseDesign.mapper.NewsMapper;
import tao.courseDesign.service.NewsService;

/**
 * @Author: Tao
 * @Time: 2020/12/21 20:51
 * @ProjectName：course-design
 * @FileName: NewsServiceImpl.java
 * @IDE: IntelliJ IDEA
 */

@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService{

}
