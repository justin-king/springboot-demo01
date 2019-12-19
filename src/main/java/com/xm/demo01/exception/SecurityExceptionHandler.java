package com.xm.demo01.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class SecurityExceptionHandler {

    @ExceptionHandler(SecurityException.class)
    @ResponseBody
    public String securityException(SecurityException ex) throws Exception{
        log.error(ex.getMessage());
        return "报错啦："+ex.getMessage();
    }

}
