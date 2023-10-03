import java.util.*;
public class SOD {
    static int Sumofdigits(int n ){
        if(n>=0 && n<=9)return n;

        return Sumofdigits(n/10) + n%10;


    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE DIGITS");
        int n = sc.nextInt();
        System.out.println(Sumofdigits(n));
    }
}
