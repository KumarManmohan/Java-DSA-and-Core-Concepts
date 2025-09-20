public class Patterns{
    public static void main(String args[]){  // i => rows ; j => Columns

        // solid rectangle

        //outer loop for rows
        // for( int i = 1; i <= 4; i++){
        //     //inner loop for columns
        //     for(int j = 1; j <=5; j++){
        //         System.out.print("*");
        //     }
        //     // after one iteration, jump to the next line
        //     System.out.println();
        // }

        // hollow rectangle

        // for(int i = 1; i <=4; i++){
        //     for( int j = 1; j <=5; j++){
        //     //only print at these locations of column
        //     if( i == 1 || j == 1 || i == 4 || j == 5){
        //         System.out.print("*");
        //     }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        //     }
            
        

        

        // //Half Pyramid
        // for(int i = 1; i<=4; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();


        // }

        //Inverted half pyramid
        // for(int i = 4; i >= 1; i--){ //inverted the first condition, rest is the same
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // } 

// // Inverted half Pyramid, rotated by 180 degrees
// int n = 4;
// //outer loop
//         for(int i = 1; i<=n; i++){
//         //inner loop -> space print
//         for(int j = 1; j <= n-i ; j++){
//             System.out.print(" ");

//             }
//             //inner loop -> star print
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
        
//             System.out.println();
//     }

// //Half Pyramid with numbers
// int n = 5; 
//     //outer loop
//     for(int i = 1; i <= n; i++){
//         for(int j = 1; j <= i; j++){
//             System.out.print(j+" " );
//         }
//         System.out.println();
//     }

// //Inverted half pyramid with Numbers
// int n = 5;
//     //outer loop
//     for(int i =1; i<=n; i++){
//         //inner loop
//          for(int j = 1; j<=n-i+1;j++){
//             System.out.print(j);
//          }
//          System.out.println();
//     }

// Floyd's Triangle

// int n = 5;
// int number = 1;
//    //outer loop
//    for(int i =1; i<=n; i++) {
//     //inner loop
//     for(int j=1; j<=i; j++){
//         System.out.print(number + " ");
//         number++; //number = number + 1
//     }
//     System.out.println();
//    } 


// //0-1 triangle
// int n = 5;
// //outer loop
// for(int i=1; i<=n; i++){
//     for(int j = 1; j<=i; j++ ){
//         int sum = i + j;
//         if(sum % 2 == 0) { //even
//             System.out.print("1 ");
//         }
//         else{ //odd
//             System.out.print("0 ");
//         }
//     }
//     System.out.println();
// }

   
    }
}
    
