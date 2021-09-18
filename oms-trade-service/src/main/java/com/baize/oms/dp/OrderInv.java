package com.baize.oms.dp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/8/7 11:41
 **/
@Data
public class OrderInv {

    @ApiModelProperty(value = "买家税号")
    private String taxpayerId;

    @ApiModelProperty(value = "抬头类型:personal 个人,enterprise 企业")
    private String raiseType;

    @ApiModelProperty(value = "抬头名称")
    private String invoiceName;

    @ApiModelProperty(value = "发票详情类型:itemCategory 商品类别,itemDetail 商品明细")
    private String invoiceDetailType;

    @ApiModelProperty(value = "0：未开票 1：已开票 2：开票失败")
    private Integer invoiceStatus;

    @ApiModelProperty(value = "发票pdf地址")
    private String invoiceUrl;
}
