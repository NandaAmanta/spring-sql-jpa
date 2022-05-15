package com.example.demo.dto;

public class ServiceResult<T> {
    boolean ok;
    String message;
    String statusCode;
    T data;
}

