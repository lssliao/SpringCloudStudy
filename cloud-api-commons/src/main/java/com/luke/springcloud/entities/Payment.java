package com.luke.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 廖水生
 * @date 2020/11/7 15:28
 * @desc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private static final long serialVersionUID = -2016038968910728271L;
    private Long id;
    private String serial;
}
