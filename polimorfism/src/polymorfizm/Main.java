package polymorfizm;

public class Main {


    public static void main(String[] args){

        Birds ostrich = new Ostrich();
        Birds crow = new Crow();
        Main test = new Main();

        test.foo(ostrich);

    }
    public void foo (Birds birds) {
        birds.walk();
    }



    }






