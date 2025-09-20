import java.util.*;
public class Age{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        

        if(age >= 18){
            System.out.println("Welcome! You are an adult.");
        }
        else{
            System.out.println("Sorry, you are not yet an adult.");
        }


    }
}