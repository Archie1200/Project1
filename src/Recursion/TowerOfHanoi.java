package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        String src="A";
        String hlp="B";
        String des="C";
        towerOfHanoi(n,src,hlp,des);
    }
    public static void towerOfHanoi(int n,String src, String hlp, String des){
        if(n==0)
            return;
        towerOfHanoi(n-1,src,des,hlp);
        System.out.println("Move "+n+"th disk from "+ src+" to "+des);
        towerOfHanoi(n-1,hlp,src,des);
    }
}
