package pratice;

public class Test {


    public static void main(String[] args) {
        Station s = new Station();
        new Thread(s,"站台4").start();
        new Thread(s,"站台5").start();
        new Thread(s,"站台6").start();
        new Thread(s,"站台7").start();
    }
}