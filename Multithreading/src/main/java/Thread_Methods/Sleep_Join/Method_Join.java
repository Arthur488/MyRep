package Thread_Methods.Sleep_Join;

public class Method_Join {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        //thread.join(1500);
        thread.join();
        System.out.println(thread.getState());
        System.out.println("Method main ends");

    }
}

class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work ends");
    }
}
