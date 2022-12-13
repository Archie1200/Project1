package SlidingWindow;

public class fixedSlidingWindow {
    public static void main(String[] args) {
        int [] arr={2,3,4,1,5,6,7,1,8,9,11,5,7};
        int k=3;
        System.out.println(MaxSumOfWindowSizek(arr,k));
    }
    public static int MaxSumOfWindowSizek(int arr[],int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int ans=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
