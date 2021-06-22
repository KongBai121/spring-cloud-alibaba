package xyz.kongbai121.springcloud.service.impl;

import org.springframework.stereotype.Service;
import xyz.kongbai121.springcloud.dao.PaymentDao;
import xyz.kongbai121.springcloud.entities.Payment;
import xyz.kongbai121.springcloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
