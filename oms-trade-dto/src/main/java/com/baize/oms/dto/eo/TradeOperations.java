package com.baize.oms.dto.eo;

import lombok.Data;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/9/17 19:18
 **/
public enum TradeOperations {
    create("创建订单"),

    audit("审核"),

    anti_audit("反审核"),

    send("发货"),

    closed("关闭"),

    receive("签收"),

    write_off("核销"),

    anti_write_off("反核销"),
    ;

    private String operId;

    TradeOperations(String operId) {
        this.operId = operId;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }
}