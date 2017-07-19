package com.imooc.utils;

import com.imooc.VO.ResultVO;

/**
 * Created by JanZhou1 on 2017/7/15.
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
