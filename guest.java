
import java.util.*;
public class guest{
    static ArrayList<String> GetSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();

        //base case
        if(s.length() == 0){
            return ans;
        }

        char cur = s.charAt(0);//a
        ArrayList<String> smallans = GetSSQ(s.substring(1));//["bc", "b", "c", ""]
      
        //smallans = ["bc", "b","c",""]
        //ans = ["abc", "bc", "ab","b", "ac","c", "a", ""]
      
        for(String ss: smallans){
            ans.add(ss);//"bc"
            ans.add(cur + ss);//"abc"


        } 
        return ans;

    }
    public static void main(String[] args) {
        ArrayList<String> ans = GetSSQ("abc");
        for(String ss: ans){
            System.out.println(ss);
        }
    }
}
 
 