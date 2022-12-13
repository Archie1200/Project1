package Recursion;

import java.util.Scanner;

public class subsequence{
    static  int count=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        printSubsequence(s,"");
        System.out.println(CountSubsequence(s,""));
    }
    public static void printSubsequence(String a,String b){
          if(a.length()==0){
              System.out.print(b+" ");
              count++;
              return;
          }
          char c =a.charAt(0);
          printSubsequence(a.substring(1),b);
          printSubsequence(a.substring(1),b+c);
    }
    public static int CountSubsequence(String a,String b){
        if(a.length()==0) {
            System.out.print(b + " ");
            return 1;
        }
        char c =a.charAt(0);
        int s1=CountSubsequence(a.substring(1),b);
        int s2=CountSubsequence(a.substring(1),b+c);
        return s1+s2;
    }
}