package swiggyfood.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<OrderItem> orderItemList=new ArrayList<>();
    private double price;
    private int serviceCharges;
    private int tipAmt;
    private String status;

    public Order(double price, int serviceCharges, int tipAmt,String status) {
        this.price = price;
        this.serviceCharges = serviceCharges;
        this.tipAmt = tipAmt;
        this.status=status;
    }
    public Order(){

    }

    public Order(double finalAmount, double tax, int i) {
    }


    public void addItem(OrderItem item){
        orderItemList.add(item);
        price=price+item.getPrice();
    }
    public void removeItem(OrderItem item){
        orderItemList.remove(item);
        price=price-item.getPrice();
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public double getPrice() {
        return price;
    }

    public int getServiceCharges() {
        return serviceCharges;
    }

    public int getTipAmt() {
        return tipAmt;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String isStatus() {
        return status;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setServiceCharges(int serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public void setTipAmt(int tipAmt) {
        this.tipAmt = tipAmt;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
