package com.baize.oms.fallback;

import com.baize.oms.domain.OrderItemEntity;
import com.baize.oms.feign.OrderItemFeignService;
import com.baize.sca.common.fallback.CommonFeignServiceFallbackFactory;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
/**
 * 订单明细表 FeignServiceFallbackFactory
 *
 * @author quleiming
 * @date 2021-09-17
 */
@Component
public class OrderItemFeignServiceFallbackFactory extends CommonFeignServiceFallbackFactory<OrderItemFeignService,OrderItemEntity> {

    @Override
    public OrderItemFeignService create(Throwable throwable) {
        return new OrderItemFeignServiceFallBack(throwable);
    }

    @Slf4j
    static class OrderItemFeignServiceFallBack extends CommonFeignServiceFallBack<OrderItemEntity> implements OrderItemFeignService {

        public OrderItemFeignServiceFallBack(Throwable throwable) {
            super(throwable);
        }
    }
}
