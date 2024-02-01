package com.example.springtest.entity;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * 统一响应实体
 *
 * @ClassName R
 * @Author zwj
 * @Date 2023/11/16 16:13
 */
public class RMain<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 成功
     */
    public static final int SUCCESS = HttpStatus.OK.value();

    /**
     * 失败
     */
    public static final int FAIL = HttpStatus.INTERNAL_SERVER_ERROR.value();

    /**
     * 编码
     */
    private int codeMain;

    /**
     * 信息
     */
    private String msgMain;

    /**
     * 数据
     */
    private T dataMain;

    public static <T> RMain<T> ok() {
        return restResult(null, SUCCESS, "操作成功");
    }

    public static <T> RMain<T> ok(T data) {
        return restResult(data, SUCCESS, "操作成功");
    }

    public static <T> RMain<T> ok(T data, String msg) {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> RMain<T> fail() {
        return restResult(null, FAIL, "操作失败");
    }

    public static <T> RMain<T> fail(String msg) {
        return restResult(null, FAIL, msg);
    }

    public static <T> RMain<T> fail(T data) {
        return restResult(data, FAIL, "操作失败");
    }

    public static <T> RMain<T> fail(T data, String msg) {
        return restResult(data, FAIL, msg);
    }

    public static <T> RMain<T> fail(int code, String msg) {
        return restResult(null, code, msg);
    }

    private static <T> RMain<T> restResult(T data, int code, String msg) {
        RMain<T> apiResult = new RMain<>();
        apiResult.setCodeMain(code);
        apiResult.setDataMain(data);
        apiResult.setMsgMain(msg);
        return apiResult;
    }

    public int getCodeMain() {
        return codeMain;
    }

    public void setCodeMain(int codeMain) {
        this.codeMain = codeMain;
    }

    public String getMsgMain() {
        return msgMain;
    }

    public void setMsgMain(String msgMain) {
        this.msgMain = msgMain;
    }

    public T getDataMain() {
        return dataMain;
    }

    public void setDataMain(T dataMain) {
        this.dataMain = dataMain;
    }

    public static <T> Boolean isError(RMain<T> ret) {
        return !isSuccess(ret);
    }

    public static <T> Boolean isSuccess(RMain<T> ret) {
        return RMain.SUCCESS == ret.getCodeMain();
    }
}