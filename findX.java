public class findX {
    static void Printindexs(int[]arr, int target, int idx){
        //base case
        if(idx>=arr.length) return ;

        //self work
        if(arr[idx]==target)
         System.out.println(idx); 


        //recursion work
        Printindexs(arr,target, idx+1);
        

    }
    // static boolean Findx(int[] arr,int target , int idx){
    //      if(idx>= arr.length) return false;

    //     //self work
    //     if(arr[idx]== target) return true;

    //     //recursion work

    //     return Findx(arr, target , idx+1);

    // }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,2,2,2,5,6,7};

        int target = 2;
       Printindexs(arr,target,0);

        // if(Findx(arr, target, 0)){
        //     System.out.println("Yes");


        // }else{
        //     System.out.println("No");
        // }
        // Printindexs(arr,target,0);
    }
    
}
