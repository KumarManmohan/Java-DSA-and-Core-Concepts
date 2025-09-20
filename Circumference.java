import java.util.*;
public class Circumference{
    public static  float PerimeterofCircle(float r){
        float perimeter = 2 * 3.14f * r;
        return perimeter;

        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float r = sc.nextFloat();

        float result = PerimeterofCircle(r);
        System.out.println("The circumference of the circle is" + " " + result + " " + "units");
    
    }
}