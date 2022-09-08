package com.huazai.bwh.common.exception;

import com.huazai.bwh.common.result.JSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JSONResult error(Exception e) {
        e.printStackTrace();
        return JSONResult.failure();
    }

    @ExceptionHandler(BwhException.class)
    @ResponseBody
    public JSONResult error(BwhException e) {
        e.printStackTrace();
        return JSONResult.failure();
    }
}
