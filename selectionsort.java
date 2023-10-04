 import java.util.*;
public class selectionsort{
    static void sort(int[] arr){
        int n = arr.length;

        for(int i = 0; i<arr.length; i++){

          //find the minimum element in the unsorted part of an array 
           int min_index = i;
        
           for(int j =i+1; j<n; j++){
                if(arr[j]< arr[min_index]){
                 min_index = j;
                }
            }
           //swap current element and minimun element -> current index i will have correct element
           //arr[min_index], arr[i]

          int temp = arr[i];
           arr[i] = arr[min_index];
           arr[min_index] = temp;

            
          

        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // int[] arr = new int[5];
        // System.out.println("enter 5 elements ");
        // for(int i=0; i<5; i++){
        //     arr[i]= x.nextInt();
        // }
        int[] arr = {5,3,4,7,2};
        sort(arr);
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
}