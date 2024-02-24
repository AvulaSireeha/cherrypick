package swiggyfood;

import swiggyfood.model.PaymentRequest;
import swiggyfood.model.PaymentResponse;

import java.util.Date;
import java.util.UUID;

public class SBIBankService {
    private String accountNum = "123456";
    public double amount = 10000;
    private String merchantAccountNum = "556688";
    private double merchantAmount = 1000;

    public PaymentResponse trnsfer(PaymentRequest request) {
        System.out.println(request.getTxId());
        if (request.isMerchantDebit()) {
            amount = amount - request.getAmount();
            amount=amount+request.getAmount();
        }else{
            amount=amount-request.getAmount();
            merchantAmount=merchantAmount+request.getAmount();
        }
            PaymentResponse response=new PaymentResponse(UUID.randomUUID().toString(),
                    "Success",new Date());
        return response;
    }
}