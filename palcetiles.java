import java.util.*;
public class palcetiles {
    static int placetiless(int n ,int m){
     if(n==m) return 2;// only 2 case is possible
     if (n<m) return 1;//only 1 case is possible

     //vertical 
     int vertplace = placetiless(n-m,m);

     //horizontal
     int horplace = placetiless(n-1, m);

     return vertplace + horplace ; 


 
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("entere the value of m");
        int m = sc.nextInt();
      
        System.out.println("Ans is here: ");
        System.out.println(placetiless(n,m));
    }
    
}
