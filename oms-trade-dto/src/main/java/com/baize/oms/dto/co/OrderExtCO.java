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
public class OrderExtCO {

    @ApiModelProperty(value = "是否预占库存 0:未占用;1:已占用")
    private Integer isPreempt;

}