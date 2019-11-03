package overload;

public class Main {




    public void foo (Birds birds){
        birds.foo();
    }


    public static void main(String[] args) {

        Birds ostroch = new Ostrich();
        Birds crow = new Crow();


        Main main = new Main();

        main.foo(crow);


    }







}
