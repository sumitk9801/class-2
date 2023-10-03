import java.util.*;
public class recursion {

    static void printDecreasing(int n){

        // base case
        if(n==1){
            System.out.println(n);

            return;
        }

        // self work
        System.out.println(n);

        // recursive work
        printDecreasing(n-1);
    }
    static void printIncreasing(int n){
        if(n == 1){                           //halting condition
            System.out.println(1);

            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. till where u want to print");
        int n = sc.nextInt();

        // printIncreasing(n);

        printDecreasing(n);
    }
    
}
