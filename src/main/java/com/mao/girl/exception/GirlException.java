package com.mao.girl.exception;

import com.mao.girl.enums.ResultCodeEnum;

/**RuntimeException可以进行事务回滚
 * Created by MaoYiHan on 2017/8/27.
 */

public class GirlException extends RuntimeException{
    private int code;

    public GirlException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMsg());
        this.code = resultCodeEnum.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
