package abstracts;


import java.util.ArrayList;

public class Abstracts {

    public static void main(String[] args){

        ArrayList<Shape> shapes = new ArrayList<>();

        Shape shape = new Circle(2, "red");
        shapes.add(shape);

        shapes.add(new Rectangle(2,3, "grey") );
        shapes.add(new Triangle(1, 2, "black"));
        shapes.add(new Triangle(5, 8, "white"));



        printShapes(shapes);
    }

    public static void printShapes(ArrayList<Shape> shapes){
        for (Shape shape : shapes){
            System.out.println("Name: "+ shape.getName());
            System.out.println("Square:" + shape.getSquare());
            System.out.println("Color: "+ shape.getColor());
        }
    }



}
