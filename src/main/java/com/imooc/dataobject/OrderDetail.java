package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by JanZhou1 on 2017/7/16.
 */
@Entity
@Data
@DynamicUpdate
@DynamicInsert
public class OrderDetail {
    @Id
    private String detailId;
    private String orderId;
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private int productQuantity;
    private String productIcon;
    private Date createTime;
    private Date updateTime;

}
