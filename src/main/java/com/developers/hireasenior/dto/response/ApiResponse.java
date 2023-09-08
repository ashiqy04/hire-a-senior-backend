package com.developers.hireasenior.dto.response;

import lombok.Data;

@Data
public class ApiResponse<T> {
    private boolean success;
    private T data;
    private String message;

    public ApiResponse() {
    }

    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ApiResponse(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }
}
