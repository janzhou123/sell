package com.imooc.dto;

import lombok.Data;

/**
 * Created by JanZhou1 on 2017/7/19.
 */
@Data
public class CartDTO {
    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
