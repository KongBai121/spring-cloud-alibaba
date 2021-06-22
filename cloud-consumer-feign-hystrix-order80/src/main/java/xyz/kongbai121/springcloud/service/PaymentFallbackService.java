package xyz.kongbai121.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "--PaymentHystrixService fall back - paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "--PaymentHystrixService fall back - paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
