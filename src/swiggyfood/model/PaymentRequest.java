package swiggyfood.model;

import java.util.Date;

public class PaymentRequest {
    private String txId;
    private double amount;
    private Date txnDate;
    private String merchantId;
    private boolean merchantDebit;
    public PaymentRequest(double amount,Date txnDate){
        this.amount=amount;
        this.txnDate=txnDate;
    }

    public PaymentRequest(String txId, double amount, Date txnDate, String merchantId,boolean merchantDebit) {
        this.txId = txId;
        this.amount = amount;
        this.txnDate = txnDate;
        this.merchantId = merchantId;
        this.merchantDebit=merchantDebit;
    }

    public String getTxId() {
        return txId;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public boolean isMerchantDebit() {
        return merchantDebit;
    }
}