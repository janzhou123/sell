package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("hahah",443);

        ProductCategory restult = repository.save(productCategory);

        Assert.assertNotNull(restult);


    }

    @Test
    public  void updateTest2(){
        ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryType(16);
        repository.save(productCategory);
    }

    @Test
    public  void findAllByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1,9,44);
        List<ProductCategory> result = repository.findAllByCategoryTypeIn(list);
        System.out.print(result.toString());
        Assert.assertNotEquals(0,result.size());


    }



}