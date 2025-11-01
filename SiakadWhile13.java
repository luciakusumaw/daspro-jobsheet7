import java.util.Scanner;
public class SiakadWhile13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score, amt, i = 0;

        System.out.print("Enter the number of students: ");
        amt = sc.nextInt();

        while (i < amt) {
            System.out.print("Enter the score of student-" + (i + 1) + ": ");
            score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a valid score!");
                continue; 
            }
            if (score > 80 && score <= 100) {
                System.out.println("Student-" + (i + 1) + " grade: A");
                System.out.println("Good job! Keep up the great work!");
            } else if (score > 73 && score <= 80) {
                System.out.println("Student-" + (i + 1) + " grade: B+");
            } else if (score > 65 && score <= 73) {
                System.out.println("Student-" + (i + 1) + " grade: B");
            } else if (score > 60 && score <= 65) {
                System.out.println("Student-" + (i + 1) + " grade: C+");
            } else if (score > 50 && score <= 60) {
                System.out.println("Student-" + (i + 1) + " grade: C");
            } else if (score > 39 && score <= 50) {
                System.out.println("Student-" + (i + 1) + " grade: D");
            } else {
                System.out.println("Student-" + (i + 1) + " grade: E");
            }
            i++;
            }
            sc.close();
    }
} 