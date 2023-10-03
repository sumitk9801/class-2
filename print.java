 import java.util.*;

public class print{
    static int printarray(int arr[], int idx){
        if(idx==arr.length){
            return arr[0];
        }
         System.out.println(arr[idx]); 
        return printarray(arr,idx+1);  
        



    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int idx = 0;
       System.out.println("Enter the size of an Array");
       int n = sc.nextInt();
       int[] arr ={5,6,7,8};
    //    arr[]=sc.nextInt();

       
       printarray(arr,idx);
    }
    
}
