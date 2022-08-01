package me.hero.myrefrigerator.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder @NoArgsConstructor @AllArgsConstructor
public class CommonResponse<T> {
    private Result result;
    private T data;
    private String message;
    private int code;

    public static <T> CommonResponse<T> success(T data) {
        return success(data, null);
    }

    public static <T> CommonResponse<T> success(T data, String message) {
        return CommonResponse.<T>builder()
                .result(Result.SUCCESS)
                .data(data)
                .message(message)
                .build();
    }

    public static CommonResponse fail(String message, int errorCode) {
        return CommonResponse.builder()
                .result(Result.FAIL)
                .message(message)
                .code(errorCode)
                .build();
    }

    public static <T> CommonResponse<T> fail(String message, T data) {
        return CommonResponse.<T>builder()
                .result(Result.FAIL)
                .message(message)
                .data(data)
                .code(-1)
                .build();
    }

    public enum Result {
        SUCCESS, FAIL;
    }
}
