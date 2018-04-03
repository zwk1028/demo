package com.xyy.saas.web.base;

/**
 * Created by wangzhenyu on 2018/4/2.
 * 返回结果状态枚举类
 */
public enum ResultCodeEnum {
    SUCCESS(0,"success"),ERROR(1,"error");
    private int code;
    private String msg;
    ResultCodeEnum(int code,String msg){
        this.code=code;
        this.msg=msg;
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
