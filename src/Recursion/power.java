package Recursion;

//public class power {
//    public static void main(String[] args) {
//        System.out.println(powerOfN(2,3));
//    }
//    public  static int powerOfN(int a,int b){
//        if(b==1)
//            return a;
//        return a*powerOfN(a,b-1);
//    }
//}

import java.util.Scanner;

public class power {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        int n=s.length();
        for(int i=0;i<n;i++){
            if((s.charAt(i)-'0')%2==0){
                int a=s.charAt(i)+ 1;
                s=s.substring(0,i)+ String.valueOf(a) +s.substring(i,n);
                n=s.length();
                i++;
            }
            else{
                int a= s.charAt(i)-1;
                s=s.substring(0,i)+ String.valueOf(a) +s.substring(i,n);
                n=s.length();
                i++;
            }
        }
        System.out.println(s);
    }
}
