package Stacks;

public class Stack {
    protected int[] arr;
    protected int top;

    public  Stack(){
        arr= new int[5];
        top=-1;
    }
   public boolean isEmpty(){
        return top==-1;
   }
    public boolean isFull(){
        return top==arr.length-1;
    }
   public void push(int item) throws Exception{
        if(isFull()){
            throw  new Exception("FULL");
        }
        top++;
        arr[top]=item;
   }
   public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("EMPTY");
        }
        int var=arr[top];
        top--;
        return  var;
   }
   public int peek(){
        int rv=arr[top];
        return rv;
   }
   public void display(){
        for (int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
       System.out.println();
   }
   public int size(){
        return top+1;
   }
}
