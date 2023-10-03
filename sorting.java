
import java.util.*;
public class sorting {
    static void printArray(int[] arr){
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static boolean isSorted(int[] arr, int n){
        boolean check = true;

        for(int i = 1; i <n ; i++){
            if(arr[i]< arr[i-1]){
                check = false;

                System.out.println(" The given array is sorted: ");
                

                break;

            }
            
        
        }return check;
        
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("enter the size of an array");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        int[] arr = new int[n];

        // giving elements
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println( isSorted(arr, n ));
        System.out.println("Sorted array is");
        Arrays.sort(arr);
       printArray(arr); 
    }
    
}
