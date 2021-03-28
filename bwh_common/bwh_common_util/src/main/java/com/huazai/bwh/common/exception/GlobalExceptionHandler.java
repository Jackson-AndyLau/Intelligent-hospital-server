package com.huazai.bwh.common.exception;

import com.huazai.bwh.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler(BwhException.class)
    @ResponseBody
    public Result error(BwhException e) {
        e.printStackTrace();
        return Result.fail();
    }
}
