package pratice;

public class FirstThreadTest implements Runnable {


    @Override
    public void run() {
        System.out.println("hjashdjashdasdhasjkdhasjdahdhja");
    }


    public static void main(String[] args) {
        FirstThreadTest firstThreadTest = new FirstThreadTest();
        new Thread(firstThreadTest,"ajhaj").start();
        new Thread(firstThreadTest,"a34340j").start();
    }
}