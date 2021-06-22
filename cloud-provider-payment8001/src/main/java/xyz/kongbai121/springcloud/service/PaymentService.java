package xyz.kongbai121.springcloud.service;

import xyz.kongbai121.springcloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
