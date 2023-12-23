package comp2522.activity;

import java.lang.Math;

/**
 * Represents a Circle Shape.
 *
 * @author LukeB
 * @version October 2021
 */
public class Circle extends Shape2D {

    private static final double PI = 3.141592535;
    private final double radius;

    /**
     * Constructs a Circle object with a radius.
     *
     * @param initialRadius Double radius
     */
    public Circle(final double initialRadius) {
        this.radius = initialRadius;
    }

    /**
     * Draws a circle.
     */
    @Override
    public void draw() {
        System.out.println("o");
    }

    /**
     * Retrieves the perimeter of this Circle.
     *
     * @return double value of perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    /**
     * Retrieves the area of this Circle.
     *
     * @return double value of area
     */
    @Override
    public double getArea() {
        return PI * Math.pow(this.radius, 2.0);
    }

}
