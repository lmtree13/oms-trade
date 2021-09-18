package com.baize.oms.rest;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.baize.sca.common.rest.CommonController;

import com.baize.oms.domain.OrderPayEntity;
import com.baize.oms.service.OrderPayService;

/**
 * 支付单表 前端控制器
 *
 * @author quleiming
 * @date 2021-09-17
 */
@RestController
@RequestMapping("/orderpay")
public class OrderPayController extends CommonController<OrderPayService, OrderPayEntity>  {

}

