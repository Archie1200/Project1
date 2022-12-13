package Recursion;

public class HeadAndTail {
    public static void main(String[] args) {
        String s="";
        int n=3;
        HeadTailPossibility(n,"",0);
    }
    public static void HeadTailPossibility(int n,String s,int i){
       if(i==n){
           System.out.println(s);
           return;
       }
       if(s.length()==0 || s.charAt(s.length()-1)!='H') {
           HeadTailPossibility(n, s + "H", i + 1);
       }
       HeadTailPossibility(n,s+"T",i+1);
    }
}
