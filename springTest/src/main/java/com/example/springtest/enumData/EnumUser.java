package com.example.springtest.enumData;

public enum EnumUser {

    // 管理员
    ADMIN(1,"描述一","地址一"),

    // 成员
    MEMBER(2,"描述二","地址二"),

    // 游客
    GUEST(3,"描述三","地址三");

    private int code;
    private String desc;
    private String address;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getAddress() {
        return address;
    }

    EnumUser(int code, String desc, String address) {
        this.code = code;
        this.desc = desc;
        this.address = address;
    }
}
