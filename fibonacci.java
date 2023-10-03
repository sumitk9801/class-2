import java.util.*;
public class fibonacci {
    static int fib(int n){
        // base work
        if( n ==0 || n==1) return n;


        // // subproblem - recurion work
        // int previous = fib(n-1);
        // int previous2 = fib(n-2);

        // // self work
        // return previous +previous2;
       
       
        return fib(n-1) + fib(n-2);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("enter the required term no.");
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}
