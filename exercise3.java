package com.company;
import java.util.ArrayList;

public class exercise3 {
    public static void main(String[] args){
        Ball ball = new Ball(4.5);
        Cylinder cylyinder = new Cylinder(3, 3);
        Pyramid pyramid = new Pyramid(20, 10);
        Box box = new Box(1000);
        System.out.println(box.add(ball));
        System.out.println(box.add(cylyinder));
        System.out.println(box.add(pyramid));
    }
}
class Shape {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends Shape {
    private double radius;
    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}
class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}

class Pyramid extends Shape{
    private double height;
    private double s;

    public Pyramid(double height, double s) {
        super(height * s * 4 / 3);
        this.height = height;
        this.s = s;
    }
}

class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;
    public Box(double available) {
        super(available);
        this.available = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
