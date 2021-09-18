package com.baize.oms.dp;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/8/4 17:12
 **/
public enum OrderState {

    INIT("创建"),

    WAIT_PAY("待支付"),

    WAIT_SEND("待发货"),

    PART_SEND("部分发货"),

    WAIT_RECEIVE("已发货"),

    TRADE_SUCCESS("已完成"),

    TRADE_CLOSED("已关闭");

    private String ststusDesc;

    public String getStstusDesc() {
        return ststusDesc;
    }

    public void setStstusDesc(String ststusDesc) {
        this.ststusDesc = ststusDesc;
    }

    OrderState(String ststusDesc) {
        this.ststusDesc = ststusDesc;
    }

    public static OrderState getState(String state) {
        for (OrderState orderState : OrderState.values()) {
            if (orderState.name().equalsIgnoreCase(state)) {
                return orderState;
            }
        }
        return null;
    }
}