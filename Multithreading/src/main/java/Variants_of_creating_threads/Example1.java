package Variants_of_creating_threads;

public class Example1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
//        Thread3 thread3 = new Thread3();
//        Thread4 thread4 = new Thread4();
//        thread3.start();
//        thread4.start();
    }
}

class Thread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 50; i > 1; i--) {
            System.out.println(i);
        }
    }
}

//class Thread3 extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 50; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class Thread4 extends Thread{
//    @Override
//    public void run() {
//        for (int i = 50; i > 1; i--) {
//            System.out.println(i);
//        }
//    }
//}
