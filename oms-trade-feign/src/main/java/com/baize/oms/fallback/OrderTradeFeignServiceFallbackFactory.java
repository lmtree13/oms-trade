package com.baize.oms.fallback;

import com.baize.oms.domain.OrderTradeEntity;
import com.baize.oms.feign.OrderTradeFeignService;
import com.baize.sca.common.fallback.CommonFeignServiceFallbackFactory;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
/**
 * 订单交易表 FeignServiceFallbackFactory
 *
 * @author quleiming
 * @date 2021-09-16
 */
@Component
public class OrderTradeFeignServiceFallbackFactory extends CommonFeignServiceFallbackFactory<OrderTradeFeignService,OrderTradeEntity> {

    @Override
    public OrderTradeFeignService create(Throwable throwable) {
        return new OrderTradeFeignServiceFallBack(throwable);
    }

    @Slf4j
    static class OrderTradeFeignServiceFallBack extends CommonFeignServiceFallBack<OrderTradeEntity> implements OrderTradeFeignService {

        public OrderTradeFeignServiceFallBack(Throwable throwable) {
            super(throwable);
        }
    }
}
