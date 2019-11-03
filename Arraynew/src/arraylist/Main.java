package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> docker = new ArrayList<>();

        docker.add(23);
        docker.add(345);
        docker.add(278);
        docker.add(457);
        docker.add(87);

        docker.remove(4);

        for (Integer dock : docker){
            System.out.println(dock);
        }
        System.out.println("Size:  " + docker.size());


    }

}
