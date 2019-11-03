package polimorfizm;

public class Main {



    public void foo(Birds birds){
        birds.walk();
    }



    public static void main(String[] args) {


        Birds ostrich = new Ostrich();
        Birds crow = new Crow();

        crow.walk();







    }





}
