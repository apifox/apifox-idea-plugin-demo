package com.example.springtest.entity;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 开航日枚举
 */
public enum OpenDateEnum implements BaseEnum<Integer> {
    /**
     *
     */
    Undefined(0, ""),
    /**
     * 周一
     */
    Monday(1, "周一"),
    /**
     * 周二
     */
    Tuesday(2, "周二"),
    /**
     * 周三
     */
    Wednesday(3, "周三"),
    /**
     * 周四
     */
    Thursday(4, "周四"),
    /**
     * 周五
     */
    Friday(5, "周五"),
    /**
     * 周六
     */
    Saturday(6, "周六"),
    /**
     * 周日
     */
    Sunday(7, "周日"),
    /**
     * 需求指定的待定字段TBN
     */
    TBN(8, "TBN");

    @JsonValue
    private final Integer value;
    private final String desc;

    OpenDateEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    public Integer getValue() {
        return this.value;
    }
}

