package com.baize.oms.dp;

import lombok.Data;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/8/4 17:11
 **/
@Data
public class OrderContext {

    public OrderContext(OrderDTO orderDTO) {
        this.orderDTO = orderDTO;
    }

    public OrderContext() {
    }

    public OrderDTO orderDTO;
}
