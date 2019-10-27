package abstracts;

import java.awt.*;
import java.util.ArrayList;

public class Interface {

    public static void main (String [] args){
        ArrayList<Shape> shapes = new ArrayList<>();
        Shape shape = new Rectangle(2,3, "red");
        shapes.add(shape);

        shapes.add(new Circle(1, "grey"));

        printShape(shapes);

    }

    public static void printShape(ArrayList<Shape> shapes){
        for (Shape shape : shapes) {
            System.out.println("Name:" + shape.getName() );
            System.out.println("Square:" + shape.getSquare() );
            System.out.println("Color:" + shape.getColor() );

        }
    }

}

