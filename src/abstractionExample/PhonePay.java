package abstractionExample;

public class PhonePay extends MetroTicket{
    private String phonePayNum;
    private String phonePayPinNum;

    public PhonePay(String phonePayNum, String phonePayPinNum) {
        this.phonePayNum = phonePayNum;
        this.phonePayPinNum = phonePayPinNum;
    }

    public Ticket bookingTicket(Ticket ticket){
        System.out.println("MetroTicket booked successfully by using Phonepay");
        return super.bookingTicket(ticket);
    }

    @Override
    public Ticket paymentMethod() {
       String phoneNum=phonePayNum;
        String pinNum=phonePayPinNum;
        if(phonePayNum.equals(phoneNum) && phonePayPinNum.equals(pinNum)){
            System.out.println("you can book the ticket");

        }else{
            System.out.println("you can't book the ticket");
        }

        return new Ticket("Kukatpaly","Hitech city",50);
    }

    @Override
    public String toString() {
        return "PhonePay{" +
                "phonePayNum='" + phonePayNum + '\'' +
                ", phonePayPinNum='" + phonePayPinNum + '\'' +
                '}';
    }

    public String getPhonePayNum() {
        return phonePayNum;
    }

    public String getPhonePayPinNum() {
        return phonePayPinNum;
    }
}
