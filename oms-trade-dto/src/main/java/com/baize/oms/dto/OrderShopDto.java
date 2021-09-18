package com.baize.oms.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 13:44
 **/
@Data
public class OrderShopDto {

    @ApiModelProperty(value = "渠道编码")
    private String channelCode;

    @ApiModelProperty(value = "渠道名称")
    private String channelName;

    @ApiModelProperty(value = "店铺编码")
    private String shopCode;

    @ApiModelProperty(value = "店铺名称")
    private String shopName;

    @ApiModelProperty(value = "门店编码")
    private String storeCode;

    @ApiModelProperty(value = "门店名称")
    private String storeName;
}
