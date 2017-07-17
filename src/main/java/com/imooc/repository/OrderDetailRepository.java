package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * Created by JanZhou1 on 2017/7/16.
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    Page<OrderDetail> findByOrderId(String orderId, Pageable pageable);
}
