import java.util.*;
public class Age{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        

        if(age >= 18){
            System.out.println("you are an an adult");
        }
        else{
            System.out.println("you are not an adult");
        }


    }
}