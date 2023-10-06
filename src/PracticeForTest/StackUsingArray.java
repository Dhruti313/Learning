package PracticeForTest;

public class StackUsingArray {
    int arr[];
    int top;
    int capacity;

    public StackUsingArray(int size){
        capacity = size;
        top = -1;
        arr = new int[capacity];
    }
    public  void push(int data ){
        if(top == capacity -1){
            System.out.println("stack overflow");
        }
        top++;
        arr[top] = data;
        System.out.print(arr[top]+" ");

    }
    public void pop(){
        if(top == -1){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("deleted successfully!");
            top--;

        }
    }
    public void peek(){
        if(top == -1){
            System.out.println("stack is empty");
        }
        System.out.println("peek item is : "+arr[top]);
    }
    public static void main(String ars[]){
        StackUsingArray st = new StackUsingArray(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println();
        st.pop();
        st.peek();



    }
}
