package com.test.demo;

public enum MAILTYPE {
    YAHOO("YAHOO", "YAHOO"),
    NET("NET", "图片"),
    SENDGRID("SENDGRID", "视频");

    public final String code;
    public final String name;

    MAILTYPE(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
