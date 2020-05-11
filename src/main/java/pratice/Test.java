package pratice;

public class Test {

    public void test1() {
        FirstThreadTest firstThreadTest = new FirstThreadTest();

    }


    public static void main(String[] args) {
        Test test = new Test();
        for (int i = 0;i<5;i++){
            test.test1();
        }

    }
}