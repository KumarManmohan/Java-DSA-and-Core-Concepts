import java.util.*;
public class FunctionsPrintMyName{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        

        printMyName("your name is" + " " + name);// calling the function
    }
}