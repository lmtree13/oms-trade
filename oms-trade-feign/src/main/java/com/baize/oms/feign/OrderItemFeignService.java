package com.baize.oms.feign;

import com.baize.oms.domain.OrderItemEntity;
import com.baize.oms.fallback.OrderItemFeignServiceFallbackFactory;
import com.baize.sca.common.feign.CommonFeignService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 订单明细表 feign接口
 *
 * @author quleiming
 * @date 2021-09-17
 */
@FeignClient(name = "oms-trade", path = "/orderitem", fallbackFactory = OrderItemFeignServiceFallbackFactory.class)
public interface OrderItemFeignService extends CommonFeignService<OrderItemEntity> {

}
