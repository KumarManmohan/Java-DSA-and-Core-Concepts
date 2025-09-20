import java.util.*;
public class UserinputCount{
    public static void main(String args[]){
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (Press 1 for Yes, 0 for No): ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("\n--- Results ---");
        System.out.println("Positive numbers entered: " + positiveCount);
        System.out.println("Negative numbers entered: " + negativeCount);
        System.out.println("Zeros entered: " + zeroCount);
        sc.close();
    }
}

