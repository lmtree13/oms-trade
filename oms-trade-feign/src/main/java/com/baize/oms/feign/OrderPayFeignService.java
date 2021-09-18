package com.baize.oms.feign;

import com.baize.oms.domain.OrderPayEntity;
import CommonFeignService;
import com.baize.oms.fallback.OrderPayFeignServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 支付单表 feign接口
 *
 * @author quleiming
 * @date 2021-09-17
 */
@FeignClient(name = "oms-trade", path = "/orderpay", fallbackFactory = OrderPayFeignServiceFallbackFactory.class)
public interface OrderPayFeignService extends CommonFeignService<OrderPayEntity> {

}
