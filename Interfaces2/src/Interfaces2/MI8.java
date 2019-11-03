package Interfaces2;

public class MI8 extends FliingObjects implements FliingUp{

    @Override
    public void fly() {
        System.out.println("I am MI8 and I can fly!!!");
      }

    @Override
    public void flyUp() {
        System.out.println("I am MI8 and I can fly and fly vertical UP!!");
    }
}
