package Thread_Methods.SetGetName_SetGetPriority;

public class SetGetName_SetGetPriority {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread1());
        thread.setName("MyThread name");
        //thread.setPriority(Thread.NORM_PRIORITY);
        thread.setPriority(7);
        thread.start();
    }
}

class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Method run in thread Name: " + Thread.currentThread().getName());
        System.out.println("Method run in thread Priority: " + Thread.currentThread().getPriority());
    }
}
