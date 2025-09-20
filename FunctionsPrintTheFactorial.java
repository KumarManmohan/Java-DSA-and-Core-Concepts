import java.util.*;
public class FunctionsPrintTheFactorial{
    public static void printTheFactorial(int n){
        //loop
        if(n <=0){
            System.out.println("Invalid input");
            return;
        }
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println("The factorial of" + " " + n + " " + "is" + " " + factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of:");
        int n = sc.nextInt();
        printTheFactorial(n);
    }

}