package FlyObject;

public class Main {

    public static void main(String[] args) {
        ObjectFly boing747 = new AirCraftBoing747();
        boing747.fly();

        HelicopterMI8 mi8 = new HelicopterMI8();
        mi8.flyUp();

        HelicopterMI8 mi81 = new HelicopterMI8();
        mi81.fly();

        RocketSpaceX spaceX = new RocketSpaceX();
        spaceX.fly();





    }
}
