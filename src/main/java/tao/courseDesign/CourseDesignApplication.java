/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： CourseDesignApplication.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author Tao
 */
@SpringBootApplication
@EnableCaching(proxyTargetClass = true)
public class CourseDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseDesignApplication.class, args);
    }

}
