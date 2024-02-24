package abstractionExample;

public abstract class MetroTicket {
    public Ticket bookingTicket(Ticket ticket){

        paymentMethod();
        return ticket;
    }

    public abstract Ticket paymentMethod();
}
