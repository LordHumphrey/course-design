/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： ResponseException.java
 * 2021-1-1 - create by Tao.
 *
 */

package tao.courseDesign.common.exceptionHandler;

import lombok.Getter;
import tao.courseDesign.common.responseEncapsulation.ResponseStatusCode;

/**
 * @Author: Tao
 * @Time: 2020/12/13 14:58
 * @ProjectName：spring-boot-demo
 * @FileName: ResponseException.java
 * @IDE: IntelliJ IDEA
 */
@Getter
public class ResponseException extends Exception {
    private final ResponseStatusCode responseStatusCode;

    public ResponseException() {
        this(ResponseStatusCode.INTERNAL_SERVER_ERROR);
    }

    private ResponseException(ResponseStatusCode responseStatusCode) {
        super(responseStatusCode.getMessage());
        this.responseStatusCode = responseStatusCode;
    }

    public ResponseException(String message, ResponseStatusCode responseStatusCode) {
        super(message);
        this.responseStatusCode = responseStatusCode;
    }

}
