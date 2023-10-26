package PracticeForTest;

public class Queue<I extends Number> {
    int maxsize;
    int queue[];
    int front;
    int rear;
    int currentzsize;

    public Queue(int size){
        maxsize = size;
        queue = new int[maxsize];
        front = 0;
        rear = -1;
        currentzsize = 0;

    }
    public  void enqeue(int element){
        if(currentzsize == maxsize){
            System.out.print("queue is full");
        }
        else{
            rear = (rear + 1)% maxsize;
            queue[rear] = element;
            currentzsize++;

        }
    }
    public int deqeue(){
        if(currentzsize == 0){
            System.out.print("queue is empty");
            return -1;
        }
        else{
            int deletedElement = queue[front];
            front = (front + 1)% maxsize;
            currentzsize--;
            return deletedElement;
        }
    }
    public int peek(){
        if(currentzsize == 0){
            System.out.print("queue is empty");
            return -1;
        }
        else{
            return queue[front];
        }
    }
    public static void main(String args[]){
        Queue<Number> q = new Queue<Number>(5);
        q.enqeue(10);
        q.enqeue(20);
        q.enqeue(30);
        q.enqeue(40);
        q.enqeue(50);

       for(int i = 0 ; i<q.maxsize ; i++){
           System.out.print(q.queue[i]+" ");
       }
       System.out.println();
       System.out.println("deleted element is :"+q.deqeue());
        System.out.println(q.peek());

    }
}
