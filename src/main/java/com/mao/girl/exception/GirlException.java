package com.mao.girl.exception;

/**RuntimeException可以进行事务回滚
 * Created by MaoYiHan on 2017/8/27.
 */

public class GirlException extends RuntimeException{
    private int code;

    public GirlException( int code,String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
