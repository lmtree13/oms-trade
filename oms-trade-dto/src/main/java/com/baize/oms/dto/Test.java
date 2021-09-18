package com.baize.oms.dto;

import com.alibaba.fastjson.JSON;
import com.baize.oms.dto.co.OrderItemCO;
import com.baize.oms.dto.co.OrderPayCO;
import com.baize.oms.dto.co.OrderTradeCO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/26 16:29
 **/
public class Test {

    public static void main(String[] args) {

        OrderTradeAddCmd cmd = new OrderTradeAddCmd();

        OrderTradeCO orderTradeCO = new OrderTradeCO();
        orderTradeCO.setActivityType(0);
        orderTradeCO.setBizMode("common");
        orderTradeCO.setCouponFee(BigDecimal.valueOf(1));
        orderTradeCO.setCouponId("111");
        orderTradeCO.setDeductionFee(BigDecimal.valueOf(1));
        orderTradeCO.setDiscount(BigDecimal.valueOf(1));
        orderTradeCO.setFreePostCard("1111");
        orderTradeCO.setFreePostFee(BigDecimal.valueOf(1));
        orderTradeCO.setFreePostType(1);
        orderTradeCO.setOrderOrg("物资领用时");
        orderTradeCO.setItemFee(BigDecimal.valueOf(1));
        orderTradeCO.setNum(1);
        orderTradeCO.setOnlineOffline("online");
        orderTradeCO.setOperator("system");
        orderTradeCO.setOrderCategory(1);
        orderTradeCO.setOrderMark("B2C");
        orderTradeCO.setOrderTime(new Date());
        orderTradeCO.setOuterOrderNo("222222222");
        orderTradeCO.setPaidFee(BigDecimal.valueOf(1));
        orderTradeCO.setPlatform("H5");
        orderTradeCO.setPointsFee(BigDecimal.valueOf(1));
        orderTradeCO.setPointsNum(1);
        orderTradeCO.setPostscript("2");
        orderTradeCO.setTotalFee(BigDecimal.valueOf(1));
        orderTradeCO.setPayableFee(BigDecimal.valueOf(1));
        orderTradeCO.setTransType(1);
        orderTradeCO.setUserId("test");
        orderTradeCO.setWayPaymentFreight("01");
        orderTradeCO.setShopCode("HQ01S115");
        orderTradeCO.setShopName("天猫-美特斯邦威旗舰店");
        orderTradeCO.setAa("bb");
        orderTradeCO.setBb("aa");
        cmd.setOrderTradeCO(orderTradeCO);


        List<OrderItemCO> orderItemCOS = new ArrayList<>();
        OrderItemCO itemCO = new OrderItemCO();
        itemCO.setTitle("123456");
        itemCO.setBarCode("123456");
        itemCO.setSellerPrc(BigDecimal.valueOf(1));
        itemCO.setTranPrice(BigDecimal.valueOf(1));
        itemCO.setDiscount(BigDecimal.valueOf(1));
        itemCO.setCouponFee(BigDecimal.valueOf(1));
        itemCO.setNum(1);
        itemCO.setPointsFee(BigDecimal.valueOf(1));
        itemCO.setPointsNum(1);
        itemCO.setItemStatus(0);
        itemCO.setItemType(0);
        itemCO.setItemId("666666");
        itemCO.setSkuId("66666666666");
//        itemCO.setColorName("黄色");
//        itemCO.setSizeName("170");
        orderItemCOS.add(itemCO);

        cmd.setOrderItemCOS(orderItemCOS);

        List<OrderPayCO> orderPayCOS = new ArrayList<>();
        OrderPayCO orderPayCO = new OrderPayCO();
        orderPayCO.setPayEndTime(new Date());
        orderPayCO.setPayStartTime(new Date());
        orderPayCO.setPayEndTime(new Date());
        orderPayCO.setPayCode("weixin");
        orderPayCO.setPayName("微信");
        orderPayCO.setPayStatus(0);
        orderPayCO.setPayStatusDesc("未支付");
        orderPayCO.setPayTotalfee(BigDecimal.valueOf(1));
        orderPayCO.setTransaction("11111111111");
        orderPayCO.setPayNote("123455");
        orderPayCOS.add(orderPayCO);
        cmd.setOrderPayCOS(orderPayCOS);
        System.out.println(JSON.toJSONString(cmd));
    }
}
