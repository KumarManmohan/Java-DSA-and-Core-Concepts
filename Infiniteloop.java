import java.util.*;
public class Infiniteloop{
    public static int loop(int n){
    int i = n; 
    do{
        System.out.println(i);
        i++;
    }
     while ( i>= n);
     return n;
    
}
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int result = loop(n);
        System.out.println(result);
}
}
    