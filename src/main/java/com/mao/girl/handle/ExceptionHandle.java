package com.mao.girl.handle;

import com.mao.girl.entity.Result;
import com.mao.girl.exception.GirlException;
import com.mao.girl.utils.ResultUtil;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by MaoYiHan on 2017/8/27.
 */

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), e.getMessage());
        } else {
            return ResultUtil.error(-1, e.getMessage());
        }
    }
}
