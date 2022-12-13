package Stacks;

import java.util.Stack;

public class Max_Score_Good_Subarray {
    public static void main(String[] args) {
        int arr[]= {1,4,3,7,4,5};
        System.out.println(Area(arr,3));
    }
        public static int Area(int[] arr,int k){
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
