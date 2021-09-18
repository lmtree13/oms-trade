package com.baize.oms.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 支付单表
 *
 * @author quleiming
 * @date 2021-09-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("order_pay")
@ApiModel(value="OrderPayEntity对象", description="支付单表")
public class OrderPayEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "支付单号")
    @TableId(value = "pay_no", type = IdType.AUTO)
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

    @ApiModelProperty(value = "创建时间")
    private Date createdDate;

    @ApiModelProperty(value = "创建人")
    private String createdUser;

    @ApiModelProperty(value = "更新时间")
    private Date modifiedDate;

    @ApiModelProperty(value = "更新人")
    private String modifiedUser;


}
