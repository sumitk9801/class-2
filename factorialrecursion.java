import java.util.*;
public class factorialrecursion {
    
    static int print(int n){
        
        if(n==1){
            System.out.println(1);
            return n;
        }
        System.out.print(n+"*");
        return print(n-1);
    }

    static int factorial(int n){
        // base case
        if(n==0) return 1;

        // smaller problem - recursion work
        // big problem - self work
    
        return n* factorial(n-1);  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user..
        System.out.println( "Enter the reqiured no");
        int n = sc.nextInt();

        System.out.println("factorial of "+ n +" is :");

       print(n);
    //    System.out.println();
       System.out.println(" And the answe is :");
       System.out.println(factorial(n));
        
    }
    
}
