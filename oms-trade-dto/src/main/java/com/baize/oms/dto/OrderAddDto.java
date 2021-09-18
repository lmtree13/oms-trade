package com.baize.oms.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 9:29
 **/
@Data
public class OrderAddDto {
    @ApiModelProperty(value = "收货人的姓名")
    private String consignee;

    @ApiModelProperty(value = "国家编码")
    private String country;

    @ApiModelProperty(value = "国家名称")
    private String countryName;

    @ApiModelProperty(value = "省份编码")
    private String province;

    @ApiModelProperty(value = "省份名称")
    private String provinceName;

    @ApiModelProperty(value = "城市编码")
    private String city;

    @ApiModelProperty(value = "城市名称")
    private String cityName;

    @ApiModelProperty(value = "地区编码")
    private String district;

    @ApiModelProperty(value = "地区名称")
    private String districtName;

    @ApiModelProperty(value = "收货人的街道")
    private String street;

    @ApiModelProperty(value = "收货人的详细地址")
    private String address;

    @ApiModelProperty(value = "收货人的邮政编码")
    private String zipcode;

    @ApiModelProperty(value = "收货人的电话号码")
    private String tel;

    @ApiModelProperty(value = "收货人的手机号码")
    private String mobile;

    @ApiModelProperty(value = "收货人的电子邮件")
    private String email;

    @ApiModelProperty(value = "收货人的最佳送货时间")
    private String bestTime;

    @ApiModelProperty(value = "用户选择的配送方式编码")
    private String priorityExpressCode;

    @ApiModelProperty(value = "用户选择的配送方式的名称")
    private String priorityExpressName;

    @ApiModelProperty(value = "配送方式（物流类型）， 0:快递发货; 1:到店自提; 2:同城配送; 9:无需发货（虚拟商品订单）")
    private Integer expressType;

    @ApiModelProperty(value = "订单承诺发货天数")
    private Integer shippingDays;
}
