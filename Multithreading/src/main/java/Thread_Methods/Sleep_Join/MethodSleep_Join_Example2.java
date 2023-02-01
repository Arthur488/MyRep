package Thread_Methods.Sleep_Join;

public class MethodSleep_Join_Example2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        MethodSleep_Join_Example2 thread2 = new MethodSleep_Join_Example2();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("End!");
    }
}

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
