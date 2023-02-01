package Thread_name_Thread_priority;

public class Example1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.setName("My thread");
        thread.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Name of thread: " + thread.getName());
        System.out.println("Priority of thread: " + thread.getPriority());


    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
