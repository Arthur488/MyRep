package Volatile;

public class Volatile_Example1 extends Thread{
    /*
    * Ключевое слово Volatile используется для пометки переменной, как хранящейся только в основной памяти
    * "Main memory", НЕ в кеше
     */
    volatile boolean b = true;

    @Override
    public void run() {
       long counter = 0;
       while (b){
           counter++;
       }
        System.out.println("Loop is finished. Counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile_Example1 thread = new Volatile_Example1();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}
