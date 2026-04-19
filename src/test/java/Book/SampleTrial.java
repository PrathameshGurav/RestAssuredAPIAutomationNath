package Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SampleTrial {
    public  static String reverseString(String st){
        String op="";
        char [] cArray=st.toCharArray();
        for (int i=cArray.length-1;i>=0;i--){
            char c=cArray[i];
            op=op+c;
        }
        return op;
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        else{

            int [] countChar=new int[256];
            for(int i =0;i<s1.length();i++){
             countChar[s1.charAt(i)]=countChar[s1.charAt(i)]+1;
             countChar[s2.charAt(i)]=countChar[s2.charAt(i)]-1;
            }
            for(int c:countChar){
                if(c!=0){
                    return false;
                }
            System.out.println(c);
            }
        }
        return true;
    }
    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>(Arrays.asList(5,2,9,1,6,2,3));
    System.out.println(list);
    

    }
}
