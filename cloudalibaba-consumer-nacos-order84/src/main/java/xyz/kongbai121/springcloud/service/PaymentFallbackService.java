package xyz.kongbai121.springcloud.service;

import org.springframework.stereotype.Component;
import xyz.kongbai121.springcloud.entities.CommonResult;
import xyz.kongbai121.springcloud.entities.Payment;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回------>PaymentFallbackService");
    }
}
