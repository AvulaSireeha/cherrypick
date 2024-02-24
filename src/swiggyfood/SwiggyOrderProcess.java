package swiggyfood;

import swiggyfood.model.Order;
import swiggyfood.model.PaymentRequest;
import swiggyfood.model.PaymentResponse;

import java.util.Date;
import java.util.UUID;

public abstract class SwiggyOrderProcess {
    SwiggyPaymentService swiggyPaymentService;
    public SwiggyOrderProcess(SwiggyPaymentService swiggyPaymentService){
        this.swiggyPaymentService=swiggyPaymentService;

    }
    public Order getFinalOrder(Order order){
        double tax=0;
        if(order.getPrice()>1000){
            tax=order.getPrice()*20/100;
        }
        double finalAmount=order.getPrice()+tax+20;
        Order finalOrder=new Order(finalAmount, tax,20);
        finalOrder.setOrderItemList(order.getOrderItemList());
       return finalOrder;
    }

    public Order order;
    public Order createOrder(Order order){
        Order finalOrder=getFinalOrder(order);
            PaymentRequest paymentInitationRequest= new PaymentRequest("SWIGGY"+ UUID.randomUUID().toString(),
                    finalOrder.getPrice(),new Date(),"556688",false);
            PaymentResponse response=swiggyPaymentService.payment(paymentInitationRequest);
            if(response!=null) {
                finalOrder.setStatus("conform");
                System.out.println(response.getCorrelationId());
            }
            delivery(finalOrder);
            return finalOrder;
    }
    public abstract boolean delivery(Order order);
}
