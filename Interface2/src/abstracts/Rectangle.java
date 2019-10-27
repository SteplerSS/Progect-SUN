package abstracts;

public class Rectangle implements Shape {

    private double hight;
    private double wedth;
    private String color;

    public Rectangle(double h,double w, String c ){
        hight = h;
        wedth = w;
        color =c;
    }


    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getSquare() {
        return hight * wedth;
    }

    @Override
    public String getColor() {
        return color;
    }
}
