public class currentBooking extends ticket{


    currentBooking(){
        super.ticketNumber++;
    }

    private int ticketPrice;


    @Override
    int getPrice() {
        ticketNumber++;
        return ticketPrice = 75;
        }

}

