package com.baize.oms.dto.eo;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/8/4 17:12
 **/
public enum TradeStatus {

    INIT("创建"),

    WAIT_PAY("待支付"),

    WAIT_SEND("待发货"),

    PART_SEND("部分发货"),

    WAIT_RECEIVE("已发货"),

    WAIT_WRITE_OFF("待核销"),

    SUCCESS("已完成"),

    CLOSED("已关闭");
    /**
     * 订单状态
     */
    private String ststus;

    TradeStatus(String ststus) {
        this.ststus = ststus;
    }

    public String getStstus() {
        return ststus;
    }

    public void setStstus(String ststus) {
        this.ststus = ststus;
    }

    public static TradeStatus getState(String state) {
        for (TradeStatus orderState : TradeStatus.values()) {
            if (orderState.name().equalsIgnoreCase(state)) {
                return orderState;
            }
        }
        return null;
    }
}