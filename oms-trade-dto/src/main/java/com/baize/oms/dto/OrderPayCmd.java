package com.baize.oms.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 16:28
 **/
@Data
public class OrderPayCmd {

    @NotNull
    private String orderNo;
    private String operator;
    private List<String> payNos;
    private String payNo;
    private String actionNoteIn;
    private String payNote;
    private String payId;
    private Double payFee;
    private String from;
    private String paymentAccount;
    private String receivingAccount;
}
