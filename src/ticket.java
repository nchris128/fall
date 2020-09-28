public abstract class ticket {
    int ticketNumber;
    int daysTil;
    private int ticketPrice = 1;

    abstract int getPrice();

    @Override
    public String toString(){
        return (" Ticket number: " + ticketNumber + " with the price of $");
    }
}
