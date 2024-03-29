package Data_race_Synchronized_methods;

import java.util.concurrent.locks.Lock;

public class Example2 {
    static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());

        thread1.start();
//        thread1.join(0, 1);
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);

    }
}

class R implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Example2.increment();
        }
    }
}
