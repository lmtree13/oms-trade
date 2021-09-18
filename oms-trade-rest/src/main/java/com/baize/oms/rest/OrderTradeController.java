package com.baize.oms.rest;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.baize.sca.common.rest.CommonController;

import com.baize.oms.domain.OrderTradeEntity;
import com.baize.oms.service.OrderTradeService;

/**
 * 订单交易表 前端控制器
 *
 * @author quleiming
 * @date 2021-09-16
 */
@RestController
@RequestMapping("/ordertrade")
public class OrderTradeController extends CommonController<OrderTradeService, OrderTradeEntity>  {

}

