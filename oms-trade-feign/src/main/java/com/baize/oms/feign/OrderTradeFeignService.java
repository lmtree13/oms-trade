package com.baize.oms.feign;

import com.baize.oms.domain.OrderTradeEntity;
import com.baize.oms.fallback.OrderTradeFeignServiceFallbackFactory;
import com.baize.sca.common.feign.CommonFeignService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 订单交易表 feign接口
 *
 * @author quleiming
 * @date 2021-09-16
 */
@FeignClient(name = "oms-trade", path = "/ordertrade", fallbackFactory = OrderTradeFeignServiceFallbackFactory.class)
public interface OrderTradeFeignService extends CommonFeignService<OrderTradeEntity> {

}
