import java.util.*;
public class PatternsRevision{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    // solid rectangle of 4 rows and 5  columns

    // for( int i = 1; i <= 4; i++ ){
    //     for(int j = 1; j <=5; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

//     // hollow rectangle with 4 rows and 5 columns
//    for(int i = 1; i <=4; i++){
//             for( int j = 1; j <=5; j++){
//             //only print at these locations of column
//             if( i == 1 || j == 1 || i == 4 || j == 5){
//                 System.out.print("*");
//             }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//             }


//Half Pyramid of 4 rows and 5 columns
// for(int i = 1; i<= 4; i++ ){
//     for(int j = 1; j <= i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


// //Inverted Half Pyramid of 4 rows and 4 columns
//  for(int i = 1; i <= 4; i++){
//     for(int j = 4; j >= i; j--){
//         System.out.print("*");
//     } 
//     System.out.println();
//  }


// //Inverted half Pyramid, Rotated by 180 deegrees
//    for (int i = 1; i<=n; i++){
//     // inner loop -> space print
//     for(int j = 1; j <=n-i; j++ ){
//         System.out.print(" ");}

//         //inner loop -> star print
//         for(int j = 1; j <= i; j++){
//           System.out.print("*");
//         }
//         System.out.println();
//         }
    

// // half pyramid with numbers

// for(int i =1; i <=n; i++){
//     for(int j = 1; j<= i; j++ ){
//         System.out.print(j);
//         }
//         System.out.println("");
// }


//inverted half pyramid with numbers
// for(int i = 1; i <=n; i++){
//     for(int j = 5 ; j>=i; j--){
//         System.out.print(j);
//     }
//     System.out.println();
// } Difficult



//Floyd's Triangle
// int number =  1;
// for(int i = 1; i<=n; i++){
// for(int j = 1; j <= i  ; j++){
//     System.out.print(number + " ");
//     number++;
// }
// System.out.println();
// }

//0-1 triangle
for(int i =1; i <=n; i++){
    for(int j = 1; j<=i; j++){
        int sum = i + j;
        if(sum % 2 == 0) //even
        {System.out.print("1");}
        else{ //odd
            System.out.print("0");
        }
        }
        System.out.println();
    }
}

       }
    

    
       
    

    
