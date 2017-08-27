package com.mao.girl.enums;

/**
 * Created by MaoYiHan on 2017/8/27.
 */

public enum ResultCodeEnum {
    SUCCESS(0,"success"),
    UNDER_20(18,"小于20岁，你太小了"),
    UPER_20(20,"大于20岁，你来吧"),
    UNKNOW_ERROR(-1,"未知错误"),
    ;
    private int code;
    private String msg;

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
