package Recursion;

public class factTailRec {
    public static void main(String[] args) {
        fact(5,1);
    }
    public  static void fact(int n,int ans){
        if(n==0) {
            System.out.println(ans);
            return;
        }
        ans=ans*n;
        fact(n-1,ans);
    }
}

