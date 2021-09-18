package com.baize.oms.dp;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baize.oms.dto.OrderAddDto;
import com.baize.oms.dto.OrderShopDto;
import com.baize.oms.dto.bo.BaseOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 16:37
 **/
@Data
@Slf4j
@EqualsAndHashCode(callSuper = false)
public class OrderTrade extends BaseOrder {

    @ApiModelProperty(value = "订单编号")
    private String orderNo;
    @ApiModelProperty(value = "渠道店铺信息")
    private OrderShopDto orderShopDto;
    @ApiModelProperty(value = "地址信息")
    private OrderAddDto orderAddDto;
    @JsonIgnore
    @ApiModelProperty(value = "订单结算价")
    private BigDecimal orderSettlePrc;
    @JsonIgnore
    @ApiModelProperty(value = "支付结算价")
    private BigDecimal paySettlePrc;

    @ApiModelProperty(value = "发票信息")
    private OrderInv orderInv;
    @ApiModelProperty(value = "扩展信息")
    private OrderTradeExt orderTradeExt;
    @ApiModelProperty(value = "订单明细单")
    private List<OrderItem> orderItems;
    @ApiModelProperty(value = "订单支付单")
    private List<OrderPay> orderPays;


    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "操作类型")
    private String operType;

    public boolean isAudit() {
        if (getTradeStatus() != null) {
            if (getTradeStatus().equals("")) {
                return false;
            }
        }
        return true;
    }
}