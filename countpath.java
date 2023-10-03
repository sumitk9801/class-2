import java.util.*;
public class countpath {
    public static int countpaths(int i ,int j , int n , int m ){
        if(i==n || j==m) return 0;

        if(i==n-1 && j == m-1) return 1;

        //downopaht
        int downpath = countpaths(i+1,j,n,m);

        //right
        int rightpath = countpaths(i,j+1, n ,m );


        return downpath + rightpath;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int n=sc.nextInt();
        int m = sc.nextInt();

        System.out.println(countpaths(0,0, n, m));
    }
    
}
