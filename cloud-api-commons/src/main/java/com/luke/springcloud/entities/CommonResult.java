package com.luke.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 廖水生
 * @date 2020/11/7 15:34
 * @desc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    private String port;

    public CommonResult(Integer code, String message) {
        this(code, message, null, null);
    }
}