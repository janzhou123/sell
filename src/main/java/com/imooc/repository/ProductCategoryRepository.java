package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by JanZhou1 on 2017/7/13.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

     List<ProductCategory> findAllByCategoryTypeIn(List<Integer> categoryTypeList);
}
