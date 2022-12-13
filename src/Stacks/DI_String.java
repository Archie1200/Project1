package Stacks;

import java.util.Stack;

public class DI_String {
    public static void main(String[] args) {
        String str="IIIDIDDD";
        System.out.println(Call(str));
    }
    public static String Call(String s){
         int []ans= new int[s.length()+1];
        Stack<Integer> st= new Stack<>();
        int count=1;
        for (int i = 0; i <=s.length(); i++) {
            if(i==s.length() || s.charAt(i)=='I'){
                ans[i]=count++;
                while (!st.isEmpty()){
                    ans[st.pop()]=count++;
                }
            }
            else{
                st.push(i);
            }
        }
        String str="";
        for(int i=0;i<ans.length;i++){
            str+=ans[i];
        }
        return str;
    }
}
