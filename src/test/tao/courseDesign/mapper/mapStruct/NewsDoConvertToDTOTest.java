/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： NewsDoConvertToDTOTest.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.mapper.mapStruct;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tao.courseDesign.DO.News;
import tao.courseDesign.DTO.NewsDTO;
import tao.courseDesign.common.mapStruct.NewsDoConvertToDTO;
import tao.courseDesign.service.impl.NewsServiceImpl;

/**
 * @Author: Tao
 * @Time: 2020/12/24 18:39
 * @ProjectName：course-design
 * @FileName: NewsDoConvertToDTOTest.java
 * @IDE: IntelliJ IDEA
 */
@SpringBootTest
class NewsDoConvertToDTOTest {
    @Autowired
    NewsDoConvertToDTO newsDoConvertToDTO;

    @Autowired
    NewsServiceImpl newsServiceImpl;

    @Test
    public void testConvert() {
        NewsDTO build = NewsDTO.builder().title("123").content("123").build();
        News news = newsDoConvertToDTO.news(build);
        newsServiceImpl.saveOrUpdate(news, new UpdateWrapper<News>().eq("title", news.getTitle()));
        System.out.println(news);
    }

    @Test
    public void testWithoutMapstruct() {
        NewsDTO build = NewsDTO.builder().title("123").content("123").build();
        News news = new News();
        BeanUtils.copyProperties(build, news);
        newsServiceImpl.saveOrUpdate(news, new UpdateWrapper<News>().eq("title", news.getTitle()));
        System.out.println(news);
    }
}