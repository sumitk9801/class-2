import java.util.*;

public class arraylist {
    static ArrayList<Integer> printallindixes(int[] arr, int target, int idx){
        //base case
        if(idx>=arr.length){
            return new ArrayList<Integer>();//give empty array

        }
        ArrayList<Integer> ans= new ArrayList<>();
        //self work
        if(arr[idx]==target){// ans -> 0
            ans.add(idx);

        }
        // recursion work
        ArrayList<Integer> smallans = new ArrayList<>();
     
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,2,2,2};
       int  target = 2;
       System.out.println(printallindixes(arr, target, 0));
    }
    
}
