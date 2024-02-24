package swiggyfood;

import swiggyfood.model.PaymentRequest;
import swiggyfood.model.PaymentResponse;

public interface SwiggyPaymentService {
    PaymentResponse payment(PaymentRequest request);
}
