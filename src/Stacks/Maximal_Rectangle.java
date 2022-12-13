package Stacks;

import java.util.Stack;

public class Maximal_Rectangle {
    public static void main(String[] args) {
        int matrix[][]={{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int ans[]= new int[matrix[0].length];
        int area=0;
        for(int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1)
                    ans[j]++;
                else
                    ans[j]=0;
            }
        }
    }
    public static int m1(int arr[],int k){
            java.util.Stack<Integer> st= new Stack<>();
            int maxarea=0;
            for(int i=0;i<arr.length;i++){
                while (!st.isEmpty() && arr[i]<arr[st.peek()]){
                    int h=arr[st.pop()];
                    int r=i;
                    if(r-1>=k) {
                        if (st.isEmpty())
                            maxarea = Math.max(maxarea, h * r);
                        else {
                            int l = st.peek();
                            if(l+1<=k)
                                maxarea = Math.max(maxarea, h * (r - l - 1));
                        }
                    }
                }
                st.push(i);
            }
            int r=arr.length;
            while (!st.isEmpty()){
                int h=arr[st.pop()];
                if(r-1>=k) {
                    if (st.isEmpty())
                        maxarea = Math.max(maxarea, h * r);
                    else {
                        int l = st.peek();
                        if (l + 1 <= k) {
                            maxarea = Math.max(maxarea, h * (r - l - 1));
                        }
                    }
                }
            }
            return maxarea;
    }

}
