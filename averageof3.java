import java.util.*;
public class averageof3{
        public static float printtheaverage(float a, float b, float c){
             
            float average = (a + b +c) / 3;
            System.out.println("The average of the three numbers is" + " " +average);
            return average;
        }
        

       
        
         public static void main(String args[]){
            Scanner sc = new  Scanner(System.in);
            System.out.println("Enter the value of a:");
            int a = sc.nextInt();
            System.out.println("Enter the value of b:");
            int b = sc.nextInt();
            System.out.println("Enter the value of c:");
            int c = sc.nextInt();

            float result = printtheaverage(a,b,c);
            System.out.println(result);

            }
        }