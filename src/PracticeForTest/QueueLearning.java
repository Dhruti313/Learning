package PracticeForTest;

public class QueueLearning {
    private int maxSize;
    private int[] queueArray    ;
    private int front;
    private int rear;
    private int currentSize;

    public QueueLearning(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int element) {
        if (currentSize == maxSize) {
            System.out.println("Queue is full. Unable to enqueue element: " + element);
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = element;
            currentSize++;
        }
    }

    public int dequeue() {
        if (currentSize == 0) {
            System.out.println("Queue is empty. Unable to dequeue element.");
            return -1;
        } else {
            int dequeuedElement = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return dequeuedElement;
        }
    }

    public int peek() {
        if (currentSize == 0) {
            System.out.println("Queue is empty. No element to peek.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int size() {
        return currentSize;
    }

    public void clear() {
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public static void main(String[] args) {
        QueueLearning queue = new QueueLearning(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Dequeue elements
        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.dequeue()); // Output: 20

        // Peek the front element
        System.out.println(queue.peek()); // Output: 30

        // Check if the queue is empty
        System.out.println(queue.isEmpty()); // Output: false

        // Get the size of the queue
        System.out.println(queue.size()); // Output: 1

        // Clear the queue
        queue.clear();
        System.out.println(queue.isEmpty()); // Output: true
    }
}
