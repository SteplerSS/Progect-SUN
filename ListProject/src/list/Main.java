package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<Person> list =new ArrayList<>();

        Person person1 = new Person( "White");
        Person person2 = new Person( "Rabbit");

        list.add(person1);
        list.add(person2);

        Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(1);

        System.out.println (person1FromCollection);
        System.out.println (person2FromCollection);

    }
}
