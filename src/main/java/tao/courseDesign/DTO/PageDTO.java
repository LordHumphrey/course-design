/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： PageDTO.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.DTO;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Tao
 * @Time: 2020/12/25 16:38
 * @ProjectName：course-design
 * @FileName: PageDTO.java
 * @IDE: IntelliJ IDEA
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageDTO<T> {
    Long pages;
    Long size;
    List<T> result;

    public PageDTO(Page<T> page) {
        this.pages = page.getPages();
        this.size = page.getSize();
        this.result = page.getRecords();
    }
}
