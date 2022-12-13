package Recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n==1 || n==0 )
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
