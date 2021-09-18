package com.baize.oms.service.impl;

import com.baize.oms.domain.OrderItemEntity;
import com.baize.oms.mapper.OrderItemMapper;
import com.baize.oms.service.OrderItemService;
import com.baize.sca.common.service.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单明细表 服务实现类
 *
 * @author quleiming
 * @date 2021-09-17
 */
@Service
public class OrderItemServiceImpl extends CommonServiceImpl<OrderItemMapper, OrderItemEntity> implements OrderItemService {

}
