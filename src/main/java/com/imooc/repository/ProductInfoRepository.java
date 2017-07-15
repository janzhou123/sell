package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by JanZhou1 on 2017/7/15.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {


    List<ProductInfo> findByProductStatus(Integer productStatus);
}
