package com.star.customvalidate.validate;


import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ValidationException;

/**
 * spring统一异常处理
 * 将异常信息封装成JSON返回给前端
 * @author whai
 * @Date: 2020/4/6 14:48
 */

@ControllerAdvice
public class ValidParamExceptionHandler {

    @ExceptionHandler(value = {BindException.class, ValidationException.class, MethodArgumentNotValidException.class})
    @ResponseBody
    public ReturnMsg biexception(Exception ex){
        ReturnMsg jsonResponse = new ReturnMsg(ResultMsgEnum.FAIL,ex.getMessage());
        return jsonResponse;
    }
}

