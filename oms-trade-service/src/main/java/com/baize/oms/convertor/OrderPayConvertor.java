package com.baize.oms.convertor;

import com.baize.oms.domain.OrderPayEntity;
import com.baize.oms.dp.OrderPay;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 16:19
 **/
public class OrderPayConvertor {

    public static OrderPayEntity toDataObject(OrderPay orderPay){
        OrderPayEntity orderPayEntity = new OrderPayEntity();
        orderPayEntity.setPayNo(orderPay.getPayNo());
        orderPayEntity.setOrderNo(orderPay.getOrderNo());
        orderPayEntity.setMergePaySn(orderPay.getMergePaySn());
        orderPayEntity.setPayStatus(orderPay.getPayStatus());
        orderPayEntity.setPayStatusDesc(orderPay.getPayStatusDesc());
        orderPayEntity.setPayCode(orderPay.getPayCode());
        orderPayEntity.setPayName(orderPay.getPayName());
        orderPayEntity.setPayTotalfee(orderPay.getPayTotalfee());
        orderPayEntity.setPaymentAccount(orderPay.getPaymentAccount());
        orderPayEntity.setReceivingAccount(orderPay.getReceivingAccount());
        orderPayEntity.setMemo(orderPay.getMemo());
        orderPayEntity.setTransaction(orderPay.getTransaction());
        orderPayEntity.setPayBeginTime(orderPay.getPayBeginTime());
        orderPayEntity.setPayEndTime(orderPay.getPayEndTime());
        orderPayEntity.setPayLastTime(orderPay.getPayLastTime());
        return orderPayEntity;

    }

    public static List<OrderPayEntity> toDataObjects(List<OrderPay> items){
        List<OrderPayEntity> list = new ArrayList<>();
        items.forEach(item -> list.add(toDataObject(item)));
        return list;
    }

    public static OrderPay toDp(OrderPayEntity entity){
        OrderPay orderPay = new OrderPay();
        orderPay.setPayNo(entity.getPayNo());
        orderPay.setOrderNo(entity.getOrderNo());
        orderPay.setMergePaySn(entity.getMergePaySn());
        orderPay.setPayStatus(entity.getPayStatus());
        orderPay.setPayStatusDesc(entity.getPayStatusDesc());
        orderPay.setPayCode(entity.getPayCode());
        orderPay.setPayName(entity.getPayName());
        orderPay.setPayTotalfee(entity.getPayTotalfee());
        orderPay.setPaymentAccount(entity.getPaymentAccount());
        orderPay.setReceivingAccount(entity.getReceivingAccount());
        orderPay.setMemo(entity.getMemo());
        orderPay.setTransaction(entity.getTransaction());
        orderPay.setPayBeginTime(entity.getPayBeginTime());
        orderPay.setPayEndTime(entity.getPayEndTime());
        orderPay.setPayLastTime(entity.getPayLastTime());
        return orderPay;

    }

    public static List<OrderPay> toDps(List<OrderPayEntity> entitys){
        List<OrderPay> list = new ArrayList<>();
        entitys.forEach(entity -> list.add(toDp(entity)));
        return list;
    }
}