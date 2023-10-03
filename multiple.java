import java.util.*;

public class multiple {
    static void table(int n, int k){
        if(k==1){//base case
            System.out.print(n+" ");
            return;
        }
        table(n,k-1);//recursive work
        System.out.print(n*k +" ");//self work
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.");
        int n = sc.nextInt();

        System.out.println("enter the no. upto which u want to print");
        int k= sc.nextInt();
    
        System.out.println("table of "+n+" is  here");
        table(n,k);
    }
}
