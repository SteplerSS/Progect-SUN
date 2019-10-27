package com.stepler;

import javax.swing.*;

class Ball{
    double radius;
    String color;
}
class Box{
    double height;
    Ball bally;

    Box(){
        height=3;
    }

    Box(double h){
        height=h;
    }

    double radius(){
        return bally.radius;
    }
    double volume(){
        return height*height*height;
    }


};


public class StudClas {



    public static void main (String []args){
        Ball ball=new Ball();
        ball.color="Red";
        ball.radius=1.0;
        System.out.println(ball.color);
        System.out.println(ball.radius);

        Ball blueBall= new Ball();
        blueBall.color="Blue";
        blueBall.radius=2;

        System.out.println(blueBall.color);
        System.out.println(blueBall.radius);
        Box box = new Box();
        box.height=2;
        box.bally=blueBall;
        System.out.println(blueBall.color);

        System.out.println(box.radius());
        System.out.println(box.volume());

        Box bigbox = new Box();
        System.out.println(bigbox.volume());

        Box somebox = new Box(5);
        System.out.println(somebox.volume());



        }



    }

