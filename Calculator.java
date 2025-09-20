import java.util.*;
public class Calculator{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number a:");
    int a = sc.nextInt();
    System.out.println("Enter the second number b;");
    int b = sc.nextInt();
    System.out.println("Enter the operation:");
    String operation = sc.next();

    // if(operation == "+"){
    // System.out.print(a + b);
    // }
    // else if (operation == "-"){
    // System.out.print(a - b);
    // }
    // else if (operation == "*"){
    // System.out.print(a * b);
    // }
    // else if (operation == "/"){
    // System.out.print(a / b);
    // }
    // else if (operation == "%"){
    // System.out.print(a % b);
    // }
    // else{
    //     System.out.println("Enter a vaild operation");
    // }
    switch (operation){
        case "+" : System.out.println(a + b);
        break;
        case "-" : System.out.println(a - b);
        break;
        case "*" : System.out.println(a * b);
        break;
        case "/" : System.out.println(a / b);
        if(b == 0){
            System.out.print("Error: cannot divide by Zero");}
            else{
                System.out.println ("Result: " + (a / b));
                }
        break;
        case "%" : 
        if (b == 0){
            System.out.println("Error: Cannot perform Modulo by Zero");
        }
        else{
            System.out.println(a % b);}
        break;
        default : System.out.println("Enter a vaild operation");
    }

   



}
}
