/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： ResponseEncapsulationAnnotation.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.common.responseEncapsulation;

import java.lang.annotation.*;

/**
 * @Author: Tao
 * @Time: 2020/12/13 14:18
 * @ProjectName：spring-boot-demo
 * @FileName: ResponsePackage.java
 * @IDE: IntelliJ IDEA
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface ResponseEncapsulationAnnotation {
}
