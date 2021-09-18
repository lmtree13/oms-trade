package com.baize.oms.fallback;

import com.baize.oms.domain.OrderPayEntity;
import com.baize.oms.feign.OrderPayFeignService;
import CommonFeignServiceFallbackFactory;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
/**
 * 支付单表 FeignServiceFallbackFactory
 *
 * @author quleiming
 * @date 2021-09-17
 */
@Component
public class OrderPayFeignServiceFallbackFactory extends CommonFeignServiceFallbackFactory<OrderPayFeignService,OrderPayEntity> {

    @Override
    public OrderPayFeignService create(Throwable throwable) {
        return new OrderPayFeignServiceFallBack(throwable);
    }

    @Slf4j
    static class OrderPayFeignServiceFallBack extends CommonFeignServiceFallBack<OrderPayEntity> implements OrderPayFeignService {

        public OrderPayFeignServiceFallBack(Throwable throwable) {
            super(throwable);
        }
    }
}
