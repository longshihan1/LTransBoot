package com.longshihan.echarts.model;

/**
 * 与APP通信的上层结构
 * @param <T>
 */
public class APP<T> {
    private boolean success;
    private T content;
    private String message;

    public APP(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public APP(String message) {
        this.success = false;
        this.message = message;
    }

    public APP(T content) {
        this.success = true;
        this.content = content;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
