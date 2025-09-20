import java.util.*;
public class Homework1Calc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first number a:");
            int a = sc.nextInt();
            System.out.println("Enter the second number b:");
            int b = sc.nextInt();
            System.out.println("Enter the operation:");
            // Use sc.next() to read just the operator token.
            // sc.nextLine() was reading the leftover newline from the last sc.nextInt().
            String operation = sc.next();

            // A switch statement is a great choice here for clarity.
            switch (operation) {
                case "+":
                    System.out.println("Result: " + (a + b));
                    break;
                case "-":
                    System.out.println("Result: " + (a - b));
                    break;
                case "*":
                    System.out.println("Result: " + (a * b));
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }
                    break;
                case "%":
                    if (b == 0) {
                        System.out.println("Error: Cannot perform modulo by zero.");
                    } else {
                        System.out.println("Result: " + (a % b));
                    }
                    break;
                default:
                    System.out.println("Enter a valid operation");
            }
        } finally {
            // It's good practice to close the scanner to prevent resource leaks.
            sc.close();
        }
    }
}
