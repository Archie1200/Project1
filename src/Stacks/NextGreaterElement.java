package Stacks;
import java.util.Stack;
import java.util.Scanner;

public class NextGreaterElement {
    public static void main(String[] args) {
       int[] arr= {10,2,1,3,5,4,8,7};
       NGE(arr);
    }
    public static void NGE(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st= new Stack<>();
        for (int i=0;i<arr.length;i++){
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                arr[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            arr[st.pop()]=-1;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
