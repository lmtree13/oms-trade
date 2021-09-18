package com.baize.oms.dto;

import com.baize.oms.dto.co.*;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 16:28
 **/
@Data
public class OrderTradeAddCmd {

    @NotNull
    private OrderTradeCO orderTradeCO;

    @NotNull
    private OrderAddressCO orderAddressCO;

    @NotNull
    private List<OrderItemCO> orderItemCOS;

    @NotNull
    private  List<OrderPayCO> orderPayCOS;

    @NotNull
    private OrderExtCO orderExtCO;
}
