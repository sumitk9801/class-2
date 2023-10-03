import java.util.*;

public class GCD {
    static int GCD1(int n,int x){
       int ans = 0;
       if(n>x){
            for(int i=x; i>=1; i--){
                if(x%i == 0 && n%i ==0){
                    return ans = i;

                }
            
            }
            
        }
        if(x>n){
    
             for(int i=n; i>=1; i--){
                if(x%i == 0 && n%i ==0){
                    return ans = i;

                }
            
            }
            
        } 
        return ans;      
    }
    

     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 elements which u want to find GCD");
        System.out.println("first element should be greater than secound one..");
        int n = sc.nextInt();
        int x= sc.nextInt();
        System.out.println(GCD1(n,x));

    }
    
}
