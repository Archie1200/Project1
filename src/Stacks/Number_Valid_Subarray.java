package Stacks;

import java.util.Stack;

public class Number_Valid_Subarray {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
        System.out.println(valid_SubArray(arr,arr.length));
    }
    public static int valid_SubArray(int arr[],int n){
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<st.peek()){
                st.pop();
            }
            st.push(arr[i]);
            ans+=st.size();
        }
        return ans;
    }
}
