package com.baize.oms.service.impl;

import com.baize.oms.domain.OrderPayEntity;
import com.baize.oms.mapper.OrderPayMapper;
import com.baize.oms.service.OrderPayService;
import com.baize.sca.common.service.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 支付单表 服务实现类
 *
 * @author quleiming
 * @date 2021-09-17
 */
@Service
public class OrderPayServiceImpl extends CommonServiceImpl<OrderPayMapper, OrderPayEntity> implements OrderPayService {

}
