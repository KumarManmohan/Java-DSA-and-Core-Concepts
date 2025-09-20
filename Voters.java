import java.util.*;
public class  Voters{
    public static void Eligibility(int age){
        if( age < 18){
            System.out.println("You are not eligible to vote");
            
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        Eligibility(age);

    }
    }
