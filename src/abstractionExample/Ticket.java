package abstractionExample;

public class Ticket {
    public String depart;
    public String arrive;
    public int ticketPrice;


    public Ticket(String depart, String arrive, int ticketPrice) {
        this.depart = depart;
        this.arrive = arrive;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "depart='" + depart + '\'' +
                ", arrive='" + arrive + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
