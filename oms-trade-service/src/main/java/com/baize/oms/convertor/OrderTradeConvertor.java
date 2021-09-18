package com.mtsbw.oms.trade.convertor;

import com.alibaba.fastjson.JSON;
import com.baize.oms.domain.OrderTradeEntity;
import com.baize.oms.dp.OrderTrade;
import com.baize.oms.dto.OrderAddDto;
import org.springframework.beans.BeanUtils;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 16:19
 **/
public class OrderTradeConvertor {

    public static OrderTradeEntity toDataObject(OrderTrade orderTrade){
        OrderTradeEntity orderTradeEntity = new OrderTradeEntity();
        orderTradeEntity.setOrderNo(orderTrade.getOrderNo());
        orderTradeEntity.setOuterOrderNo(orderTrade.getOuterOrderNo());
        orderTradeEntity.setTradeStatus(orderTrade.getTradeStatus());
        orderTradeEntity.setTradeStatusStr(orderTrade.getTradeStatusStr());
        orderTradeEntity.setBizMode(orderTrade.getBizMode());
        orderTradeEntity.setPresaleMode(orderTrade.getPresaleMode());
        orderTradeEntity.setTransType(orderTrade.getTransType());
        orderTradeEntity.setOrderType(orderTrade.getOrderType());
        orderTradeEntity.setUserId(orderTrade.getUserId());
        orderTradeEntity.setChannelCode(orderTrade.getChannelCode());
        orderTradeEntity.setChannelName(orderTrade.getChannelName());
        orderTradeEntity.setShopCode(orderTrade.getShopCode());
        orderTradeEntity.setShopName(orderTrade.getShopName());
        orderTradeEntity.setStoreCode(orderTrade.getStoreCode());
        orderTradeEntity.setStoreName(orderTrade.getStoreName());
        orderTradeEntity.setExchangeOriginalNo(orderTrade.getExchangeOriginalNo());
        orderTradeEntity.setExchangeRefundNo(orderTrade.getExchangeRefundNo());
        orderTradeEntity.setOriginalOrderNo(orderTrade.getOriginalOrderNo());
        orderTradeEntity.setOnlineOffline(orderTrade.getOnlineOffline());
        orderTradeEntity.setItemFee(orderTrade.getItemFee());
        orderTradeEntity.setDiscount(orderTrade.getDiscount());
        orderTradeEntity.setFreight(orderTrade.getFreight());
        orderTradeEntity.setTotalFee(orderTrade.getTotalFee());
        orderTradeEntity.setPaidFee(orderTrade.getPaidFee());
        orderTradeEntity.setDeductionFee(orderTrade.getDeductionFee());
        orderTradeEntity.setUsePointsFee(orderTrade.getUsePointsFee());
        orderTradeEntity.setUsePointsNum(orderTrade.getUsePointsNum());
        orderTradeEntity.setCouponId(orderTrade.getCouponId());
        orderTradeEntity.setCouponFee(orderTrade.getCouponFee());
        orderTradeEntity.setPayableFee(orderTrade.getPayableFee());
        orderTradeEntity.setNum(orderTrade.getNum());
        orderTradeEntity.setLackType(orderTrade.getLackType());
        orderTradeEntity.setPromotions(orderTrade.getPromotions());
        orderTradeEntity.setBuyerMessage(orderTrade.getBuyerMessage());
        orderTradeEntity.setSellerMessage(orderTrade.getSellerMessage());
        orderTradeEntity.setFlag(orderTrade.getFlag());
        orderTradeEntity.setCloseCode(orderTrade.getCloseCode());
        orderTradeEntity.setCloseReason(orderTrade.getCloseReason());
        orderTradeEntity.setOrderCategory(orderTrade.getOrderCategory());
        orderTradeEntity.setPreeOccupy(orderTrade.getPreeOccupy());
        orderTradeEntity.setConsignee(orderTrade.getConsignee());
        orderTradeEntity.setCountry(orderTrade.getCountry());
        orderTradeEntity.setProvince(orderTrade.getProvince());
        orderTradeEntity.setCity(orderTrade.getCity());
        orderTradeEntity.setDistrict(orderTrade.getDistrict());
        orderTradeEntity.setAddress(orderTrade.getAddress());
        orderTradeEntity.setZipcode(orderTrade.getZipcode());
        orderTradeEntity.setTel(orderTrade.getTel());
        orderTradeEntity.setMobile(orderTrade.getMobile());
        orderTradeEntity.setEmail(orderTrade.getEmail());
        orderTradeEntity.setBestTime(orderTrade.getBestTime());
        orderTradeEntity.setPriorityExpressCode(orderTrade.getPriorityExpressCode());
        orderTradeEntity.setPriorityExpressName(orderTrade.getPriorityExpressName());
        orderTradeEntity.setExpressType(orderTrade.getExpressType());
        orderTradeEntity.setPayType(orderTrade.getPayType());
        orderTradeEntity.setIsCac(orderTrade.getIsCac());
        orderTradeEntity.setAssistantId(orderTrade.getAssistantId());
        orderTradeEntity.setOrderFinished(orderTrade.getOrderFinished());
        orderTradeEntity.setInvoiceInfo(orderTrade.getInvoiceInfo());
        orderTradeEntity.setInvoiceStatus(orderTrade.getInvoiceStatus());
        orderTradeEntity.setRefundState(orderTrade.getRefundState());
        orderTradeEntity.setOrderExtra(orderTrade.getOrderExtra());
        orderTradeEntity.setOrderTime(orderTrade.getOrderTime());
        orderTradeEntity.setPayTime(orderTrade.getPayTime());
        orderTradeEntity.setAuditTime(orderTrade.getAuditTime());
        orderTradeEntity.setConsignTime(orderTrade.getConsignTime());
        orderTradeEntity.setReceivedTime(orderTrade.getReceivedTime());
        orderTradeEntity.setFinishTime(orderTrade.getFinishTime());
        orderTradeEntity.setExpiredTime(orderTrade.getExpiredTime());
        orderTradeEntity.setCreatedDate(orderTrade.getCreatedDate());
        orderTradeEntity.setCreatedUser(orderTrade.getCreatedUser());
        orderTradeEntity.setModifiedDate(orderTrade.getModifiedDate());
        orderTradeEntity.setModifiedUser(orderTrade.getModifiedUser());
        return orderTradeEntity;


    }

    public static OrderTrade toDp(OrderTradeEntity entity){
        OrderTrade orderTrade = new OrderTrade();
        orderTrade.setOrderNo(entity.getOrderNo());
        orderTrade.setChannelCode(entity.getChannelCode());
        orderTrade.setChannelName(entity.getChannelName());
        orderTrade.setOrderNo(entity.getOrderNo());
        orderTrade.setOuterOrderNo(entity.getOuterOrderNo());
        orderTrade.setTradeStatus(entity.getTradeStatus());
        orderTrade.setTradeStatusStr(entity.getTradeStatusStr());
        orderTrade.setBizMode(entity.getBizMode());
        orderTrade.setPresaleMode(entity.getPresaleMode());
        orderTrade.setTransType(entity.getTransType());
        orderTrade.setOrderType(entity.getOrderType());
        orderTrade.setUserId(entity.getUserId());
        orderTrade.setChannelCode(entity.getChannelCode());
        orderTrade.setChannelName(entity.getChannelName());
        orderTrade.setShopCode(entity.getShopCode());
        orderTrade.setShopName(entity.getShopName());
        orderTrade.setStoreCode(entity.getStoreCode());
        orderTrade.setStoreName(entity.getStoreName());
        orderTrade.setExchangeOriginalNo(entity.getExchangeOriginalNo());
        orderTrade.setExchangeRefundNo(entity.getExchangeRefundNo());
        orderTrade.setOriginalOrderNo(entity.getOriginalOrderNo());
        orderTrade.setOnlineOffline(entity.getOnlineOffline());
        orderTrade.setItemFee(entity.getItemFee());
        orderTrade.setDiscount(entity.getDiscount());
        orderTrade.setFreight(entity.getFreight());
        orderTrade.setTotalFee(entity.getTotalFee());
        orderTrade.setPaidFee(entity.getPaidFee());
        orderTrade.setDeductionFee(entity.getDeductionFee());
        orderTrade.setUsePointsFee(entity.getUsePointsFee());
        orderTrade.setUsePointsNum(entity.getUsePointsNum());
        orderTrade.setCouponId(entity.getCouponId());
        orderTrade.setCouponFee(entity.getCouponFee());
        orderTrade.setPayableFee(entity.getPayableFee());
        orderTrade.setNum(entity.getNum());
        orderTrade.setLackType(entity.getLackType());
        orderTrade.setPromotions(entity.getPromotions());
        orderTrade.setBuyerMessage(entity.getBuyerMessage());
        orderTrade.setSellerMessage(entity.getSellerMessage());
        orderTrade.setFlag(entity.getFlag());
        orderTrade.setCloseCode(entity.getCloseCode());
        orderTrade.setCloseReason(entity.getCloseReason());
        orderTrade.setOrderCategory(entity.getOrderCategory());
        orderTrade.setPreeOccupy(entity.getPreeOccupy());
        orderTrade.setConsignee(entity.getConsignee());
        orderTrade.setCountry(entity.getCountry());
        orderTrade.setProvince(entity.getProvince());
        orderTrade.setCity(entity.getCity());
        orderTrade.setDistrict(entity.getDistrict());
        orderTrade.setAddress(entity.getAddress());
        orderTrade.setZipcode(entity.getZipcode());
        orderTrade.setTel(entity.getTel());
        orderTrade.setMobile(entity.getMobile());
        orderTrade.setEmail(entity.getEmail());
        orderTrade.setBestTime(entity.getBestTime());
        orderTrade.setPriorityExpressCode(entity.getPriorityExpressCode());
        orderTrade.setPriorityExpressName(entity.getPriorityExpressName());
        orderTrade.setExpressType(entity.getExpressType());
        orderTrade.setPayType(entity.getPayType());
        orderTrade.setIsCac(entity.getIsCac());
        orderTrade.setAssistantId(entity.getAssistantId());
        orderTrade.setOrderFinished(entity.getOrderFinished());
        orderTrade.setInvoiceInfo(entity.getInvoiceInfo());
        orderTrade.setInvoiceStatus(entity.getInvoiceStatus());
        orderTrade.setRefundState(entity.getRefundState());
        orderTrade.setOrderExtra(entity.getOrderExtra());
        orderTrade.setOrderTime(entity.getOrderTime());
        orderTrade.setPayTime(entity.getPayTime());
        orderTrade.setAuditTime(entity.getAuditTime());
        orderTrade.setConsignTime(entity.getConsignTime());
        orderTrade.setReceivedTime(entity.getReceivedTime());
        orderTrade.setFinishTime(entity.getFinishTime());
        orderTrade.setExpiredTime(entity.getExpiredTime());
        orderTrade.setCreatedDate(entity.getCreatedDate());
        orderTrade.setCreatedUser(entity.getCreatedUser());
        orderTrade.setModifiedDate(entity.getModifiedDate());
        orderTrade.setModifiedUser(entity.getModifiedUser());
        return orderTrade;
    }

    private static void builderTrade(OrderTradeEntity orderTradeEntity, OrderAddDto orderAddDto) {
        if (orderAddDto == null) {
            return;
        }
        orderTradeEntity.setConsignee(orderAddDto.getConsignee());
        orderTradeEntity.setCountry(orderAddDto.getCountry());
        orderTradeEntity.setProvince(orderAddDto.getProvince());
        orderTradeEntity.setCity(orderAddDto.getCity());
        orderTradeEntity.setDistrict(orderAddDto.getDistrict());
        orderTradeEntity.setTel(orderAddDto.getTel());
        orderTradeEntity.setMobile(orderAddDto.getMobile());
        orderTradeEntity.setExpressType(orderAddDto.getExpressType());
    }
}
