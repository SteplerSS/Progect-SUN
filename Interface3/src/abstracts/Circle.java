package abstracts;

public class Circle implements Shape {

    private double radius;
    private String color;

    Circle (double r, String c){
        radius =r;
        color =c;
    }


    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return 3.1415 * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }
}
