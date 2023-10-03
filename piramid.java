import java.util.*;

public class piramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the no. of rows");
        int n = sc.nextInt();

    
        // System.out.println(" Enter the no. col");
        // int m = sc.nextInt();
    
        // PRINT PATTERN 
        /*

         *
         **
         ***
         ****
         ******


         */

         

         for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");

            }
            System.out.println();
         }
        

     
        // print pattern 
        /*
         *****
         ***
         **
         *
         */

        for(int i = n; i>=1 ; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");


            }
            System.out.println();




        //FOR OPPOSITE SIDE HALG TRAINGLE 
        /*
           *
          **
         ***
        ****  

         */

        // for(int i=1 ; i<=n; i++){
        //     for(int j =1; j<=n-i;j++){
        //         System.out.print(" ");
                

        //     }
        //     for(int j =1; j<= i; j++){
        //         System.out.print("*");
  

        //     }
        //     System.out.println();
        // }

        }   


        
    }
}
