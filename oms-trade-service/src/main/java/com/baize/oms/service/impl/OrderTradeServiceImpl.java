package com.baize.oms.service.impl;

import com.baize.oms.domain.OrderTradeEntity;
import com.baize.oms.mapper.OrderTradeMapper;
import com.baize.oms.service.OrderTradeService;
import com.baize.sca.common.service.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单交易表 服务实现类
 *
 * @author quleiming
 * @date 2021-09-16
 */
@Service
public class OrderTradeServiceImpl extends CommonServiceImpl<OrderTradeMapper, OrderTradeEntity> implements OrderTradeService {

}
