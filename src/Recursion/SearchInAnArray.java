package Recursion;

public class SearchInAnArray {
    public static void main(String[] args) {
        int arr[]={1,9,12,5,4,8,10,2};
        int j=arr.length-1;
        System.out.println(search(arr,8,j));
    }
    public static int search(int arr[],int x,int j){
        if(j<0)
            return -1;
        if(arr[j]==x)
            return j;
        return search(arr,x,j-1);
    }
}
