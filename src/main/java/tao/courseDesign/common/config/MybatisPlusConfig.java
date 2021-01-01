/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： MybatisPlusConfig.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.common.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: Tao
 * @Time: 2020/12/23 18:37
 * @ProjectName：course-design
 * @FileName: MybatisPlusConfig.java
 * @IDE: IntelliJ IDEA
 */
@Configuration
@EnableTransactionManagement
@MapperScan("tao.courseDesign.mapper")
public class MybatisPlusConfig {
    @Bean
    public GlobalConfig globalConfig() {
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setMetaObjectHandler(new MybatisPlusAutoFillConfig());
        return globalConfig;
    }

    @Bean
    public MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        //单页分页数量限制
        paginationInnerInterceptor.setMaxLimit(20L);
        mybatisPlusInterceptor.addInnerInterceptor(paginationInnerInterceptor);
        return mybatisPlusInterceptor;
    }

}
