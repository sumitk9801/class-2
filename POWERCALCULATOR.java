import java.util.*;
public class POWERCALCULATOR {
    static int pow(int p , int q){
        // base case
        if(q==0) return 1;

        //sub problem -> recursion work
        // int smallpro = pow(p,q-1);

        //selfwork
        return pow(p,q-1)* p;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the base no");
        int p = sc.nextInt();

        System.out.println("Enter power value");
        int q = sc.nextInt();

        System.out.println(pow(p,q));
    }
}
