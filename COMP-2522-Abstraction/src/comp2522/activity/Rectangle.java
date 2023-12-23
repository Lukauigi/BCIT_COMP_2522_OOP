package comp2522.activity;

/**
 * Represents a Rectangle Shape.
 *
 * @author LukeB
 * @version October 9, 2021
 */
public class Rectangle extends Shape2D {

    private final double width;
    private final double height;

    public Rectangle(final double initialWidth, final double initialHeight) {
        this.width = initialWidth;
        this.height = initialHeight;
    }

    @Override
    public void draw() {
        System.out.println("[]");
    }

    @Override
    public double getPerimeter() {
        return this.width + this.height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
