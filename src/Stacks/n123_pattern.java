package Stacks;

import java.util.Stack;

public class n123_pattern {
    public static void main(String[] args) {
        int arr[]={3,1,4,2};
    }
    public static boolean Pattern132(int[] arr){
        int min[]= new int[arr.length];
        min[0]=arr[0];
        for(int i=1;i<min.length;i++){
            min[i]=Math.max(min[i-1],arr[i]);
        }
        Stack<Integer> st = new Stack<>();
        for (int j=arr.length-1;j>=0;j--){
            int ith=min[j];
            while (!st.isEmpty() && ith>=arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty() && arr[j]>arr[st.peek()])
                return true;
            st.push(j);
        }
        return false;
    }
}
