package com.baize.oms.convertor;

import com.baize.oms.domain.OrderItemEntity;
import com.baize.oms.domain.OrderTradeEntity;
import com.baize.oms.dp.OrderItem;
import com.baize.oms.dp.OrderTrade;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 16:19
 **/
public class OrderItemConvertor {

    public static OrderItemEntity toDataObject(OrderItem orderItem){
        OrderItemEntity orderItemEntity = new OrderItemEntity();
        orderItemEntity.setItemNo(orderItem.getItemNo());
        orderItemEntity.setOrderNo(orderItem.getOrderNo());
        orderItemEntity.setDeliNo(orderItem.getDeliNo());
        orderItemEntity.setActualWarehouse(orderItem.getActualWarehouse());
        orderItemEntity.setVirtualWarehouse(orderItem.getVirtualWarehouse());
        orderItemEntity.setItemStatus(orderItem.getItemStatus());
        orderItemEntity.setTitle(orderItem.getTitle());
        orderItemEntity.setItemId(orderItem.getItemId());
        orderItemEntity.setSkuId(orderItem.getSkuId());
        orderItemEntity.setBarCode(orderItem.getBarCode());
        orderItemEntity.setItemType(orderItem.getItemType());
        orderItemEntity.setNum(orderItem.getNum());
        orderItemEntity.setSellerPrc(orderItem.getSellerPrc());
        orderItemEntity.setTranPrice(orderItem.getTranPrice());
        orderItemEntity.setSettlePrice(orderItem.getSettlePrice());
        orderItemEntity.setDiscount(orderItem.getDiscount());
        orderItemEntity.setCouponFee(orderItem.getCouponFee());
        orderItemEntity.setPointsFee(orderItem.getPointsFee());
        orderItemEntity.setPointsNum(orderItem.getPointsNum());
        orderItemEntity.setItemInfo(orderItem.getItemInfo());
        orderItemEntity.setMainSkuId(orderItem.getMainSkuId());
        orderItemEntity.setExchangeSkuId(orderItem.getExchangeSkuId());
        orderItemEntity.setBrandCode(orderItem.getBrandCode());
        orderItemEntity.setAssistantId(orderItem.getAssistantId());
        orderItemEntity.setIsPreSale(orderItem.getIsPreSale());
        orderItemEntity.setIsProtect(orderItem.getIsProtect());
        orderItemEntity.setRefundType(orderItem.getRefundType());
        orderItemEntity.setRefundStatus(orderItem.getRefundStatus());
        orderItemEntity.setRefundNo(orderItem.getRefundNo());
        orderItemEntity.setRefundNum(orderItem.getRefundNum());
        orderItemEntity.setBizCode(orderItem.getBizCode());
        orderItemEntity.setExpressState(orderItem.getExpressState());
        orderItemEntity.setExpressNo(orderItem.getExpressNo());
        orderItemEntity.setOid(orderItem.getOid());
        orderItemEntity.setOccNum(orderItem.getOccNum());
        orderItemEntity.setEstimatedTime(orderItem.getEstimatedTime());
        orderItemEntity.setGoodsExtra(orderItem.getGoodsExtra());
        return orderItemEntity;
    }

    public static List<OrderItemEntity> toDataObjects(List<OrderItem> orderItems){
        List<OrderItemEntity> list = new ArrayList<>();
        orderItems.forEach(item -> list.add(toDataObject(item)));
        return list;
    }

    public static OrderItem toDp(OrderItemEntity entity){
        OrderItem orderItem = new OrderItem();
        orderItem.setItemNo(entity.getItemNo());
        orderItem.setOrderNo(entity.getOrderNo());
        orderItem.setDeliNo(entity.getDeliNo());
        orderItem.setActualWarehouse(entity.getActualWarehouse());
        orderItem.setVirtualWarehouse(entity.getVirtualWarehouse());
        orderItem.setItemStatus(entity.getItemStatus());
        orderItem.setTitle(entity.getTitle());
        orderItem.setItemId(entity.getItemId());
        orderItem.setSkuId(entity.getSkuId());
        orderItem.setBarCode(entity.getBarCode());
        orderItem.setItemType(entity.getItemType());
        orderItem.setNum(entity.getNum());
        orderItem.setSellerPrc(entity.getSellerPrc());
        orderItem.setTranPrice(entity.getTranPrice());
        orderItem.setSettlePrice(entity.getSettlePrice());
        orderItem.setDiscount(entity.getDiscount());
        orderItem.setCouponFee(entity.getCouponFee());
        orderItem.setPointsFee(entity.getPointsFee());
        orderItem.setPointsNum(entity.getPointsNum());
        orderItem.setItemInfo(entity.getItemInfo());
        orderItem.setMainSkuId(entity.getMainSkuId());
        orderItem.setExchangeSkuId(entity.getExchangeSkuId());
        orderItem.setBrandCode(entity.getBrandCode());
        orderItem.setAssistantId(entity.getAssistantId());
        orderItem.setIsPreSale(entity.getIsPreSale());
        orderItem.setIsProtect(entity.getIsProtect());
        orderItem.setRefundType(entity.getRefundType());
        orderItem.setRefundStatus(entity.getRefundStatus());
        orderItem.setRefundNo(entity.getRefundNo());
        orderItem.setRefundNum(entity.getRefundNum());
        orderItem.setBizCode(entity.getBizCode());
        orderItem.setExpressState(entity.getExpressState());
        orderItem.setExpressNo(entity.getExpressNo());
        orderItem.setOid(entity.getOid());
        orderItem.setOccNum(entity.getOccNum());
        orderItem.setEstimatedTime(entity.getEstimatedTime());
        orderItem.setGoodsExtra(entity.getGoodsExtra());
        return orderItem;

    }

    public static List<OrderItem> toDps(List<OrderItemEntity> entitys){
        List<OrderItem> list = new ArrayList<>();
        entitys.forEach(entity -> list.add(toDp(entity)));
        return list;
    }
}