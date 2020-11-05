package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Rosemary
 * @title: CommonResult
 * @projectName cloud2020
 * @description: 给前端的接口类
 * @date 2020/11/39:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;

    private static final int SUCCESS_MSG_CODE = 200;
    private static final String SUCCESS_MSG = "操作成功";
    private static final int ERROR_MSG_CODE = 500;
    private static final String ERROR_MSG = "系统错误";

    public CommonResult(Integer code, String msg) {
        this(code, msg, null);
    }

    public static <T> CommonResult<T> SUCCESS(T data) {
        return new CommonResult<>(SUCCESS_MSG_CODE, SUCCESS_MSG, data);
    }

    public static <T> CommonResult<T> ERROR() {
        return new CommonResult<>(ERROR_MSG_CODE, ERROR_MSG, null);
    }

    public static <T> CommonResult<T> ERROR(String msg) {
        return new CommonResult<>(ERROR_MSG_CODE, msg, null);
    }

    public static <T> CommonResult<T> ERROR(int code, String msg, T data) {
        return new CommonResult<>(code, msg, data);
    }
}
