package Recursion;

public class DiceTarget {
    public static void main(String[] args) {
        int n=3;
        int k=4;
        targetSum(0,k,"");
    }
    public static void targetSum(int curr,int end,String ans){
        if(curr==end){
            System.out.println(ans);
            return ;
        }
        if(curr>end)
            return;
        for(int dice=1;dice<=3;dice++){
            targetSum(curr+dice,end,ans+dice);
        }
    }
}
