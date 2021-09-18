package com.baize.oms.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/9/17 17:17
 **/
@Data
public class OrderItemSnapshot {

    @ApiModelProperty(value = "套装名称")
    private String groupName;

    @ApiModelProperty(value = "尺码名称")
    private String sizeName;

    @ApiModelProperty(value = "颜色名称")
    private String colorName;

    @ApiModelProperty(value = "商品图片地址")
    private String picPath;

    @ApiModelProperty(value = "促销id")
    private String promotionId;

    @ApiModelProperty(value = "促销描述")
    private String promotionName;

    @ApiModelProperty(value = "吊牌价")
    private BigDecimal onBrandPrc;
}