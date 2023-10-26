package DS;

import java.util.Stack;

public class TwoStackArray {
    int array[];
    int size;
    int stack1;
    int stack2;

    public void TwoStackInArray(int capacity){
        array = new int[capacity];
        size = capacity;
        stack1 = -1;
        stack2 = size;
    }
    public void stack1(int value){
        if(stack1 < stack2 -1){
            array[++stack1] = value;
        }
        else{
            System.out.println("stack1 is full");
        }
    }
    public void stack2(int value){
        if(stack1 < stack2 -1){
            array[--stack2] = value;
        }
        else{
            System.out.println("stack2 is full");
        }
    }
    public int pop1(){
        if(stack1 >=0){
            return array[stack1--];
        }
        else{
            System.out.println("stack1 is empty");
            return -1;
        }
    }
    public int pop2(){
        if(stack2 < size){
            return array[stack2++];
        }
        else{
            System.out.println("stack2 is empty");
            return -1;
        }
    }
    public static void main(String args[]){
        TwoStackInArray arr = new TwoStackInArray(10);
        arr.push1(1);
        arr.push1(2);
        arr.push1(3);
        arr.push1(4);
        arr.push2(10);
        arr.push2(11);
        arr.push2(12);
        arr.push2(13);
        System.out.println(arr.pop1());
        System.out.println(arr.pop2());

    }
}
