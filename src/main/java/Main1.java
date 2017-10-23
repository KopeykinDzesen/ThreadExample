public class Main1 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

    }

}

class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
