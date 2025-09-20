public class AdvancePatterns{
    public static void main(String args[]){


        //Butterfly Pattern


        // int n = 4;
        // //upper part, 1st half
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     //sapce printing
        //    int spaces = 2 * (n - i);
        //    for(int j = 1; j<=spaces; j++){
        //     System.out.print(" ");
        //    }

        //    // upper part, 2nd half
        //    for(int j = 1; j<=i; j++){
        //     System.out.print("*");
        //    }
        //    System.out.println();

        // }

        //  //lower part, 1st half
        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     //sapce printing
        //    int spaces = 2 * (n - i);
        //    for(int j = 1; j<=spaces; j++){
        //     System.out.print(" ");
        //    }

        //    // lower part, 2nd half
        //    for(int j = 1; j<=i; j++){
        //     System.out.print("*");
        //    }
        //    System.out.println();

        // }



        // // Solid Rhombus
        // int n = 5;
        // for(int i =1; i <=n; i++){
        //     // space printing
        //  int spaces = n - i;
        //  for( int j = 1; j<=spaces; j++){
        //     System.out.print(" ");
        //  }
        //  //star printing
        //  for(int j  = 1; j<=n; j++){
        //     System.out.print("*");
        //  }

        // System.out.println();

        // }

// //Number Pyramid
// int n =5;
// for( int i =1; i<=n; i++){
//     // space printing
//     int spaces = n - i;
//     for(int j = 1; j <= spaces; j++){
//         System.out.print(" ");
//     }
// //  Numbers print -> print row numbers, row number of times
//     for(int j = 1; j<= i; j++){
//         System.out.print(i + " ");
//     }
//     System.out.println();
// }

// Palindromic Patterns
// int n = 5;
// for(int i = 1; i<=n; i++){
//     //  space print
//     int spaces = n - i;
//     for(int j = 1; j<=spaces; j++){
//         System.out.print(" ");
//     }
//     //1st half numbers
//     for(int j=i; j>=1; j--){
//         System.out.print(j);
//     }
//     //second half numbers
//     for(int j = 2;  j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

//Diamond pattern
int n = 4;
//upper part
for(int i = 1; i <=n; i++){
    // space print
    int spaces = n-i;
    for(int j = 1; j<=spaces; j++){
        System.out.print(" ");
    }
    //upper half stars
    for(int j = 1; j<=2*i-1; j++){
        System.out.print("*");
    } 
    System.out.println();
}
     //lower part
for(int i = n; i >=1; i--){
    // space print
    int spaces = n-i;
    for(int j = 1; j<=spaces; j++){
        System.out.print(" ");
    }
    //lower part stars
    for(int j = 1; j<=2*i-1; j++){
        System.out.print("*");
    } 
    System.out.println();
}
    
    }
}