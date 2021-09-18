package com.baize.oms.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 16:28
 **/
@Data
public class OrderTradeAuditCmd {

    @NotNull
    private String orderNo;

    private String operator;
}
