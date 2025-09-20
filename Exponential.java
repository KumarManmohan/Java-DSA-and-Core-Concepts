import java.util.*;
public class Exponential{
    
    public static int operation(int num , int power){
        int answer = 1;
        for(int i = 0; i<power; i++){
            answer = answer * num;
        }
        return answer;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("Enter the power:");
        int power = sc.nextInt();

        int result = operation(num,power);
        System.out.println(result);
    }
}