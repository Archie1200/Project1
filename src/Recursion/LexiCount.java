package Recursion;

public class LexiCount {
    public static void main(String[] args) {
        LexicoCounting(0,13);
    }
    public  static void LexicoCounting(int curr,int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            LexicoCounting(curr*10+i,n);
        }
    }
}
