package com.imooc.enums;

import lombok.Getter;

/**
 * Created by JanZhou1 on 2017/7/19.
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"GOODS IS NOT EXIST"),
    PRODUCT_STOCK_ERR(11,"STOCK IS NOT ENOUGH")
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
