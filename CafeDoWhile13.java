import java.util.Scanner;
public class CafeDoWhile13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffee, tea, bread;
        String customerName;
        int totalPrice, coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        do {
            System.out.print("Enter Customer Name (type 'cancel' to out): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction is Canceled. ");
                break;
            }
            System.out.print("Input coffee amount: ");
            coffee = sc.nextInt();
            System.out.print("Input tea amount: ");
            tea = sc.nextInt();
            System.out.print("Input bread amount: ");
            bread = sc.nextInt();

            totalPrice = (coffee*coffeePrice) + (tea*teaPrice) + (bread*breadPrice);
            System.out.println("Total Price: Rp" + totalPrice);
            sc.nextLine();
        } while (true);

        System.out.println("All Transaction is Done.");
        sc.close();
    }
}
