package Recursion;

import java.util.Scanner;

public class printNnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=5;
        callN(n);
    }
    public static void callN(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        callN(n-1);
        System.out.println(n);
    }
}
