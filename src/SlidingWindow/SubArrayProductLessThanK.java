package SlidingWindow;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int [] arr={1,2,4,3,5,2,3};
        int k=3;
        System.out.println(NoOfSubArray(arr,k));
    }
    public static int NoOfSubArray(int [] arr,int k){
        int ans=0;
        int ei=0;
        int si=0;
        int p=1;
        while(ei<arr.length){
            // window grow
            p=p*arr[ei];
            //window shrink
            while(p>=k && si<=ei){
                p/=arr[si];
                si++;
            }
            //calculate answer
            ans+= ei+si-1;
            ei++;
        }
        return ans;
    }
}
