package com.example.demo.dto;

public class Response<T> {
    private boolean ok;
    private String statusCode;
    private String message;
    private T data;

    public Response() {
    }

    public Response(boolean ok, String statusCode, String message, T data) {
        this.ok = ok;
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
