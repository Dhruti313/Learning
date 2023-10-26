package DS;

public class TwoStackInArray {
        private int[] arr;
        private int size;
        private int top1;
        private int top2;

        public TwoStackInArray(int capacity) {
            arr = new int[capacity];
            size = capacity;
            top1 = -1;
            top2 = size;
        }

        public boolean push1(int value) {
            if (top1 < top2 - 1) {
                arr[++top1] = value;
            } else {
                System.out.println("Stack 1 is full. Cannot push " + value);
            }
            return false;
        }

        public void push2(int value) {
            if (top1 < top2 - 1) {
                arr[--top2] = value;
            } else {
                System.out.println("Stack 2 is full. Cannot push " + value);
            }
        }

        public int pop1() {
            if (top1 >= 0) {
                return arr[top1--];
            } else {
                System.out.println("Stack 1 is empty.");
                return -1;
            }
        }

        public int pop2() {
            if (top2 < size) {
                return arr[top2++];
            } else {
                System.out.println("Stack 2 is empty.");
               return -1;
            }
        }

        public static void main(String[] args) {
            TwoStackInArray stacks = new TwoStackInArray(6);

            stacks.push1(1);
            stacks.push1(2);
            stacks.push2(11);
            stacks.push2(12);
            stacks.push1(3);
            stacks.push2(13);
//            stacks.pop2();
//            stacks.pop2();
//            stacks.pop2();


            System.out.println("Popped from Stack 1: " + stacks.pop1());
            System.out.println("Popped from Stack 2: " + stacks.pop2());
        }
    }


