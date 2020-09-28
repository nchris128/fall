public class advanceBooking extends ticket {
    int req = 15;
    int subtractedDays;
    int ticketPrice;
    advanceBooking() {
        daysTil = 0;
    }

    advanceBooking(int days) {
        daysTil = days;
        subtractedDays = req - daysTil;
    }


    @Override
    int getPrice() {
        ticketNumber++;
//       System.out.println(daysTil + " days till");
        if (subtractedDays < 0) {
            //return (ticketPrice + "ticket price should be 25");
            return ticketPrice = 25;
        } else if (subtractedDays > 0) {
//            System.out.println(ticketPrice + "ticket price");
            return ticketPrice = 50;
        }
        return (123);
    }


}
