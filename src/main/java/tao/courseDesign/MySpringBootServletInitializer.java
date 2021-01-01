/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： MySpringBootServletInitializer.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Tao
 */
public class MySpringBootServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CourseDesignApplication.class);
    }
}
