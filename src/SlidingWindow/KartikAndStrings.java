package SlidingWindow;

public class KartikAndStrings {
    public static void main(String[] args) {
        String s="abbbabababba";
        int k=3;
        int flipa=maxSubstringSize(s,'a',k );
        int flipb=maxSubstringSize(s,'b',k );
        System.out.println(Math.max(flipa,flipb));
    }
    public static int maxSubstringSize(String str,char ch,int k){
           int si=0;
           int ei=0;
           int ans=0;
           int flip=0;
           while(ei<str.length()){
               if(str.charAt(ei)==ch){
                   flip++;
               }
               while(flip>k){
                   if(str.charAt(si)==ch)
                       flip--;
                   si++;
               }
               ans=Math.max(ans,ei-si+1);
               ei++;
           }
           return ans;
    }
}
