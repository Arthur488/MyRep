package Thread_name_Thread_priority;

public class Example2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example2());
        thread.start();
        System.out.println("Method main. Thread name = " + Thread.currentThread().getName());
    }
}
