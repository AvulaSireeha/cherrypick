package abstractionExample;

public class BookingTicketTest {
    public static void main(String[] args) {
        Ticket ticket=new Ticket("Kukatpaly","Hitech City",50);
        MetroTicket phonepay=new PhonePay("7569742357","0628");
        phonepay.bookingTicket(ticket);
        System.out.println(phonepay.bookingTicket(ticket));
        Ticket ticket1=phonepay.paymentMethod();
        System.out.println("payment method ="+ticket1);
    }
}
