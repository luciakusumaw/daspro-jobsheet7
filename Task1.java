import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ticketPrice = 50000, totalTicket = 0, totalSales = 0, price;
        String more;
        int tickets;

        do { 
            System.out.print("Enter number of tickets bought: ");
            tickets = sc.nextInt();

            if (tickets < 0) {
                System.out.print("Invalid Input, Try Again! ");
            }
            while (tickets < 0);
        price = tickets * ticketPrice;
        if (tickets > 10) {
        price *= 0.85;
        } else if (tickets > 4) {
        price *= 0.90;
        }

        totalTicket += tickets;
        totalSales += price;
        System.out.print("Is there another customer? (yes/no): ");
        more = sc.next();
        } while (more.equalsIgnoreCase("yes"));

        System.out.println("\n===== Daily Sales Summary =====");
        System.out.println("Total tickets sold: " + totalTicket);
        System.out.println("Total ticket sales: Rp " + totalSales);
        sc.close();
    }
}
