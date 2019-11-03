package interfaces;

public class Main {

    public static void main(String[] args) {

        Mi8 mi8 = new Mi8();
        Boing737 boing737 = new Boing737();

        Test test = new Test();
        test.foo(mi8);

    }
}
