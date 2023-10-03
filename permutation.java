import java.util.*;
public class permutation{
     static void printperm(String string ,String permutation){
        if(string.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<string.length(); i++){
            char currchar = string.charAt(i);// jiss character ko beithana hai ...

            //"abcd" -> "bcd"
            String newstr = string.substring(0, i) + string.substring(i+1);//eg - "bcd"
            printperm(newstr,permutation+currchar);
        }
     
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String string = sc.nextLine();

    //    String str ="abc";

       printperm(string,"");
    }
}