public class discountBooking extends ticket{
    discountBooking(){

    }
    discountBooking(int x){
        daysTil = x;
        ticketNumber++;

    }

    private int ticketPrice;
    private int req = 1;
    @Override
    int getPrice() {
        ticketNumber++;
        if (daysTil - req < 0){
            return ticketPrice = 10;
        }
        else{
            return ticketPrice = 75;
        }
    }

}
