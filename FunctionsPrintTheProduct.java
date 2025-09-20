import java.util.*;
public class FunctionsPrintTheProduct{
    public static int printTheProduct(int a, int b){
        int product = a*b;
        return product;
    }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a:");
            int a = sc.nextInt();
            System.out.println("Enter the value of b:");
            int b = sc.nextInt();

            int result = printTheProduct(a,b);
            System.out.println("The product of the two number is " + result);

            
        
    }
}