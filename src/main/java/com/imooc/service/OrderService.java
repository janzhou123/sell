package com.imooc.service;

import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by JanZhou1 on 2017/7/17.
 */

public interface OrderService {

    //创建接口

    OrderDTO create(OrderDTO orderDTO);
    //取消接口
    OrderDTO cancel(OrderDTO orderDTO);
    //查询接口  单个
    OrderDTO findOne(String orderId);
    //查询接口  多个
    Page<OrderDTO> findList(String buyerOpenId, Pageable pageable);
    //完结订单
    OrderDTO finish(OrderDTO orderDTO);
    //支付订单
    OrderDTO paid(OrderDTO orderDTO);
}
