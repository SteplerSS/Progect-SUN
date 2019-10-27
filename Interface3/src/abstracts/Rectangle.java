package abstracts;

public class Rectangle implements Shape{

    private double hight;
    private double width;
    private String color;

    Rectangle(double h,double w, String c ){
        hight = h;
        width = w;
        color = c;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getSquare() {
        return hight * width;
    }

    @Override
    public String getColor() {
        return color;
    }
}
