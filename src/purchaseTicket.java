import java.util.ArrayList;
import java.util.Scanner;

public class purchaseTicket {
    public static void main(String[] args) {
        ArrayList<ticket> ticks = new ArrayList<ticket>();
//        ticks.add(new advanceBooking(16));
//        System.out.println(ticks.get(0) + Integer.toString(ticks.get(0).getPrice()));
//        ticks.add(new currentBooking());
//        System.out.println(ticks.get(1) + Integer.toString(ticks.get(1).getPrice()));
//        for (int j = 0; j < ticks.size(); j++) {
//                        System.out.println(ticks.get(j) + Integer.toString(ticks.get(j).getPrice()));
//                    }

        boolean keepOn = true;
            while(keepOn== true){
            int i = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose from the following: \n1. Sell a ticket for a future game\n2. Sell a ticket for today's game\n3. Sell a discount ticket\n4. Print All Tickets\n5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter the amount of days till the game");
                    int days = sc.nextInt();
                    ticks.add(new advanceBooking(days));
                    System.out.println("You sold: " + ticks.get(i) + ticks.get(i).getPrice());
                    System.out.println();
                    break;
                case 2:
                    ticks.add(new currentBooking());
                    System.out.println("You sold: " + ticks.get(i) + ticks.get(i).getPrice());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Please enter the amount of days till the game");
                    days = sc.nextInt();
                    ticks.add(new discountBooking(days));
                    System.out.println("You sold:" + ticks.get(i) + ticks.get(i).getPrice());
                    System.out.println();
                    break;
                case 4:
                    for (int j = 0; j < ticks.size(); j++) {
                        System.out.println(ticks.get(j) + Integer.toString(ticks.get(j).getPrice()));
                    }
                case 5:
                    keepOn = false;
                    break;
                default:
                    System.out.println("Please enter a valid number");
                    break;
            }
                i++;
        }
    }
}
