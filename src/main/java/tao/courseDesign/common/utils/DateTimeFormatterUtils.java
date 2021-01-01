/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： DateTimeFormatterUtils.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.common.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: Tao
 * @Time: 2020/12/30 19:23
 * @ProjectName：course-design
 * @FileName: DataFormatUtils.java
 * @IDE: IntelliJ IDEA
 */
public class DateTimeFormatterUtils {
    public static LocalDateTime convertToMonthAndDay(LocalDateTime localDataTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd");
        return LocalDateTime.parse(dateTimeFormatter.format(localDataTime));
    }
}
