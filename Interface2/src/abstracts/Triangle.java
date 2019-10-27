package abstracts;


public class Triangle implements Shape {
    private double side1;
    private double side2;
    private String color;


    public Triangle(double s1,double s2, String c){
        side1=s1;
        side2 =s2;
        color =c;
    }

        @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getSquare() {
        return side1 * side2 /2;
    }

    @Override
    public String getColor() {
        return color;
    }
}
