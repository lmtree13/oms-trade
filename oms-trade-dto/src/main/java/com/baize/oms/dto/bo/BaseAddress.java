package com.baize.oms.dto.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/26 11:07
 **/
@Data
public class BaseAddress implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "收货人的姓名")
    private String consignee;

    @ApiModelProperty(value = "国家名称")
    private String country;

    @ApiModelProperty(value = "省份名称")
    private String province;

    @ApiModelProperty(value = "城市名称")
    private String city;

    @ApiModelProperty(value = "地区名称")
    private String district;

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
}
