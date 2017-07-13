package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by JanZhou1 on 2017/7/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private  ProductCategoryRepository  repository;

    @Test
    public void findOneTest1(){

        ProductCategory productCategory = repository.findOne(2);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();

        productCategory.setCategoryName("WWWWWW");
        productCategory.setCategoryType(2);

        repository.save(productCategory);


    }

    @Test
    public  void updateTest2(){
        ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryType(15);
        repository.save(productCategory);
    }

}