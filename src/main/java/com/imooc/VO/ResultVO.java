package com.imooc.VO;

import lombok.Data;

/**
 * Created by JanZhou1 on 2017/7/15.
 */
@Data
public class ResultVO<T>{
//错误码
    private Integer code;
//提示信息
    private String msg;
//具体内容
    private T data;

}
