package Recursion;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        String s="AABC";
        ArrayList<String> arr = new ArrayList<>();
        print_Permutation(s,"");
    }
    public static void print_Permutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean f=false;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==ch) {
                    f=true;
                    break;
                }
            }
            if(!f){
                String s1=s.substring(0,i);
                String s2= s.substring(i+1);
                print_Permutation(s1+s2,ans+ch);
            }
        }
    }
}
