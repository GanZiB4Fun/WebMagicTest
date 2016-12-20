package net.niuniubao.ant.simuquan.model;

import java.io.Serializable;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/25.
 */
public class Json<T> implements Serializable {
    private static final long serialVersionUID = 7833407848693721608L;

    private int code;

    private String msg;

    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
