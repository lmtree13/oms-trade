package com.baize.oms.rest;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.baize.sca.common.rest.CommonController;

import com.baize.oms.domain.OrderItemEntity;
import com.baize.oms.service.OrderItemService;

/**
 * 订单明细表 前端控制器
 *
 * @author quleiming
 * @date 2021-09-17
 */
@RestController
@RequestMapping("/orderitem")
public class OrderItemController extends CommonController<OrderItemService, OrderItemEntity>  {

}

