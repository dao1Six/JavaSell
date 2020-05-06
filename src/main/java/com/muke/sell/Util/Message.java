package com.muke.sell.Util;


import lombok.Data;

@Data

public class Message {
    private String msg;
    private String code;
    private Object data;

    public Message(String msg, String code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }
}
