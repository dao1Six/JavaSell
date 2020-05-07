package com.muke.sell.Util;

import com.muke.sell.Enmu.StatusEnmu;
import lombok.Data;

@Data
public class Response<T> {
    // 状态码,成功为0,失败为1,也封装成常量类
    private Integer status;
    // 消息,成功消息或者失败消息
    private String msg;
    // 要返回的数据
    private T data;


    //失败时构造这个
    private Response(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    //成功时构造这个
    private Response(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 状态码 + 成功提示信息
     */
    public static  Response createResponseBySuccess() {
        return new Response(StatusEnmu.SUCCESS.getCode(),StatusEnmu.SUCCESS.getMsg());
    }

    /**
     * 状态码 + 成功提示信息 + 数据
     */
    public static <T> Response<T> createResponseBySuccess(T data) {
        return new Response<>(StatusEnmu.SUCCESS.getCode(),StatusEnmu.SUCCESS.getMsg(),data);
    }

    /**
     * 状态码 + 错误信息
     */
    public static <T> Response<T> createResponseByError() {
        return new Response<>(StatusEnmu.ERROR.getCode(), StatusEnmu.ERROR.getMsg());
    }
}
