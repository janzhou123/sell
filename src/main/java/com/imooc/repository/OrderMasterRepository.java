package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by JanZhou1 on 2017/7/16.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {


    Page<OrderMaster> findByBuyerOpenid(String buyerOpenId, Pageable pageable);
}
