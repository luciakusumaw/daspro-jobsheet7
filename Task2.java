import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = -1, duration = 0, total = 0;
        System.out.println("=== Parking Fee Calculator ===");
        while (true) {
            System.out.print("\nEnter vehicle type (1 = Car, 2 = Motorcycle, 0 = Exit): ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter 0, 1, or 2.");
                sc.next();
                continue;
            }
            type = sc.nextInt();
            if (type == 0) {
                break;
            }
            if (type != 1 && type != 2) {
                System.out.println("Unknown vehicle type. Try again.");
                continue;
            }
            System.out.print("Enter parking duration (hours): ");
            if (!sc.hasNextInt()) {
                System.out.println("Duration must be a number!");
                sc.next();
                continue;
            }
            duration = sc.nextInt();
            if (duration < 0) {
                System.out.println("Duration cannot be negative!");
                continue;
            }
            if (duration > 5) {
                total += 12500;
                System.out.println("Flat rate applied: Rp 12,500");
            } else if (type == 1) {
                total += duration * 3000;
                System.out.println("Carc" + duration + " hours 3000 = Rp " + duration * 3000);
            } else if (type == 2) {
                total += duration * 2000;
                System.out.println("Motorcyclec" + duration + " hours 2000 = Rp " + duration * 2000);
            }
        }
        System.out.println("\n=== Final Result ===");
        System.out.println("Total parking fee today: Rp " + total);
        sc.close();
    }
}
