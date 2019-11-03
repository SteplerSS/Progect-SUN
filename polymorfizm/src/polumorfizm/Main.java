package polumorfizm;

public class Main {

    public static void main (String[] args){
       Animal cat = new Cat();
       Animal dog = new Dog();

       Main test = new Main();
       test.foo(dog);


    }

    public void foo(Animal animal)
    {
        animal.talk();
        System.out.println(animal.getClass().getName());
    }





}
