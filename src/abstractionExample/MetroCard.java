package abstractionExample;

public class MetroCard extends MetroTicket{

    public boolean metrocard;
    public Ticket bookingTicket(Ticket ticket){
        System.out.println("MetroTicket booked successfully by using MetroCard");
        return super.bookingTicket(ticket);
    }

    @Override
    public Ticket paymentMethod() {

        if(metrocard==true){
            System.out.println("you can book the ticket by using metrocard");

        }else {
            System.out.println("you can't book the ticket by using metrocard");
        }

        return new Ticket("Kukatpaly","Hitech city",50);
    }
}
