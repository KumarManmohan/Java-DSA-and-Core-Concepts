import java.util.*;
public class Excercise1{
    public class averageof3{
        public static int printtheaverage(int a, int b, int c){
             
            int average = (a + b +c) /3;
            System.out.println("The average of the three numbers is" + average);
            return average;
        }
        }

       
        
         public static void main(String args[]){
            Scanner sc = new  Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int result = printtheaverage(a,b,c);
            System.out.println(result);

            }

       

    

    }

