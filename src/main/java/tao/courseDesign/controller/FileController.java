/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： FileController.java
 * 2021-1-5 - create by Tao.
 *
 */

package tao.courseDesign.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import tao.courseDesign.VO.FileVO;
import tao.courseDesign.VO.MinIoProperties;
import tao.courseDesign.common.utils.MinIoUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping(value = {""})
public class FileController {
    @Autowired
    MinIoProperties minIoProperties;

    @PostMapping("upload-img")
    public FileVO uploadImg(HttpServletRequest request) {
        MultipartHttpServletRequest multipartHttpServletRequest = ((MultipartHttpServletRequest) request);
        MultiValueMap<String, MultipartFile> multiFileMap = multipartHttpServletRequest.getMultiFileMap();
        Set<Map.Entry<String, MultipartFile>> entries = multipartHttpServletRequest.getFileMap().entrySet();
        MultipartFile file = null;
        String upload = "";
        List<String> uploadUrls = new ArrayList<>(3);
        for (Map.Entry<String, MultipartFile> entry : entries) {
            file = entry.getValue();
            uploadUrls.add(MinIoUtil.upload(minIoProperties.getBucketName(), file));
        }
        log.info(uploadUrls.toString());
        return FileVO.builder().errno("0").data(uploadUrls).build();
    }
}
