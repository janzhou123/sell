package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by JanZhou1 on 2017/7/19.
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {

        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
