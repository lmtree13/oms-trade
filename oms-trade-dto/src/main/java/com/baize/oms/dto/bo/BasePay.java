package com.baize.oms.dto.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/26 11:12
 **/
@Data
public class BasePay {

    @ApiModelProperty(value = "支付单号")
    private String payNo;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "合并支付单号")
    private String mergePaySn;

    @ApiModelProperty(value = "支付状态；0，未付款；1，已付款；2：待确认")
    private Integer payStatus;

    @ApiModelProperty(value = "支付状态对应描述；0，未付款；1，已付款；2：待确认")
    private String payStatusDesc;

    @ApiModelProperty(value = "支付方式code")
    private String payCode;

    @ApiModelProperty(value = "支付方式名称")
    private String payName;

    @ApiModelProperty(value = "付款单总金额")
    private BigDecimal payTotalfee;

    @ApiModelProperty(value = "支付账号")
    private String paymentAccount;

    @ApiModelProperty(value = "收款账号")
    private String receivingAccount;

    @ApiModelProperty(value = "付款备注")
    private String memo;

    @ApiModelProperty(value = "支付流水号")
    private String transaction;

    @ApiModelProperty(value = "支付开始时间")
    private Date payBeginTime;

    @ApiModelProperty(value = "支付结束时间")
    private Date payEndTime;

    @ApiModelProperty(value = "最后付款时间")
    private Date payLastTime;
}
