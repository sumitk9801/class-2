 
import java.util.*;
public class printStar{
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         

         System.out.println("Enter no of rows");
         int n = sc.nextInt();
        
         System.out.println("Enter no. of col");
        int m = sc.nextInt();

        // pattern
        for(int i =1; i<=n ; i++ ){ // rows
            for(int j = 1; j<=m  ; j++){ // col
                if( i == 1 || j==1 || i==n || j==m){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }


            } 
            System.out.println();

        }
        
        
    }
}


    

