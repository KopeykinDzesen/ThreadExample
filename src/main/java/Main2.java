public class Main2 {

    public static void main(String[] args) {

        new SomeThread().start();
        new SomeThread().start();
        new SomeThread().start();

    }

}

class SomeThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 400; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
