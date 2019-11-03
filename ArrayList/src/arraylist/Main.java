package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animals> animals = new ArrayList<>();


        animals.add(new Cats("Busa", 3));
        animals.add(new Cats("Dasha", 6));
        printAnimals(animals);

    }

        public static void printAnimals(ArrayList<Animals> animals){
            for (Animals animal : animals){
                System.out.println("Name: " + animal.getName());
                System.out.println("Age: " + animal.getAge());


            }

        };
    };


