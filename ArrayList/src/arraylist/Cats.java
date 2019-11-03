package arraylist;

public class Cats implements Animals {
    String name;
    int age;

     Cats(String n, int ag) {
        name = n;
        age = ag;
    };

        @Override
        public String getName () {
            return name;
        }

        @Override
        public int getAge () {
            return age;
        }
    }



