package com.mes.baseserver.utils;

import java.util.Map;

public class ExtMsg {
    private boolean success = true;// 是否成功
    private String msg = "操作成功";// 提示信息
    private Object data = null;// 其他信息
    private Map<String, Object> attributes;// 其他参数
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
