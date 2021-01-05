/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： MybatisPlusAutoFillConfig.java
 * 2021-1-5 - create by Tao.
 *
 */

package tao.courseDesign.common.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Author: Tao
 * @Time: 2020/12/23 18:36
 * @ProjectName：course-design
 * @FileName: MybatisPlusAutoFillConfig.java
 * @IDE: IntelliJ IDEA
 */
@Component
public class MybatisPlusAutoFillConfig implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        strictInsertFill(metaObject, "gmtCreated", LocalDateTime.class, LocalDateTime.now());
        strictUpdateFill(metaObject, "gmtModified", LocalDateTime.class, LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        strictInsertFill(metaObject, "gmtCreated", LocalDateTime.class, LocalDateTime.now());
        strictUpdateFill(metaObject, "gmtModified", LocalDateTime.class, LocalDateTime.now());
    }
}
