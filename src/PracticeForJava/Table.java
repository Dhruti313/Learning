package PracticeForJava;

class Table {
//    synchronized void printTable(int n) { // synchronized method
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(n * i);
//            try {
//                Thread.sleep(400);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//    }
//}
synchronized void printTable(int n) throws InterruptedException {
    for(int i = 1 ; i <=5 ; i++){
        System.out.println(n*i);
        Thread.sleep(400);
    }
}
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        try {
            t.printTable(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

//class MyThread2 extends Thread {
//    Table t;
//
//    MyThread2(Table t) {
//        this.t = t;
//    }
//
//    public void run() {
//        t.printTable(100);
//    }
//}

