package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> arr= new ArrayList<>();
        generateParenthesis(arr,"",0,0,n);
        System.out.println(arr);
    }
    public static void generateParenthesis(ArrayList<String> arr, String s, int open, int close, int n){
        if(s.length()==n*2){
            arr.add(s);
            return;
        }
        if(open < n) {
            generateParenthesis(arr,s+"(",open+1,close,n);
        }
        if(close<open){
            generateParenthesis(arr,s+")",open,close+1,n);
        }
    }

}
