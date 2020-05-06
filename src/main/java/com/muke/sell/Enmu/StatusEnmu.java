package com.muke.sell.Enmu;


import lombok.Getter;

@Getter
public enum StatusEnmu {
    SUCCESS(0,"成功"),
    ERROR(1,"失败");

    private int code;
    private String msg;

    StatusEnmu(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
