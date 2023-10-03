import java.util.*;
public class printSum{
    static int sumOfArray(int[] arr,int idx){
        if(idx == arr.length){
            return 0;
        }

        // recursion work
        int small = sumOfArray(arr,idx+1);

        //self work
        return small+ arr[idx];

            


    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);

        int[] arr = {2,2,2,2,2,2,2,};
        System.out.println(sumOfArray(arr,0));

    }

}