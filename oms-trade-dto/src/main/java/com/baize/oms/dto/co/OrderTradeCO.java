package com.baize.oms.dto.co;

import com.baize.oms.dto.bo.BaseOrder;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 16:26
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderTradeCO extends BaseOrder {

    @ApiModelProperty(value = "0:未占用;1:已占用")
    private Integer preeOccupy;

    @ApiModelProperty(value = "免邮类型 0:不免邮;1:单品免邮;2:整单免邮;3:满足规则免邮;")
    private Integer freePostType;

    @ApiModelProperty(value = "免邮券卡号")
    private String freePostCard;

    @ApiModelProperty(value = "免邮前邮费金额")
    private BigDecimal freePostFee;

    @ApiModelProperty(value = "运费付款方式 01:到付;02:自付")
    private String wayPaymentFreight;

}