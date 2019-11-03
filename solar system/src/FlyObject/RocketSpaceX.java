package FlyObject;

public class RocketSpaceX extends ObjectFly implements StartUp{
    @Override
    public void fly() {
        System.out.println("SpaceX: It is a great rocket SpaceX and it cans fly between continental!!!");
    }

    @Override
    public void flyUp() {
        System.out.println("SpaceX :It is a great rocket SpaceX and it cans fly in space!!");
    }
}
