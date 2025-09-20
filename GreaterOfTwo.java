import java.util.*;
public class GreaterOfTwo{
    public static void Greater(int a, int b){
        if ( a >  b){
            System.out.println(a + " " + "is greater than " + " " + b);
        }
             else if (b > a){
            System.out.println(b + " " + "is greater than " + " " + a);
            }
            else {
                System.out.println(a + " " + "is equal to " + " " + b);
            }

        
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        Greater(a,b);
    }

}