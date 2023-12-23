package comp2522.activity;

/**
 * Represents an abstract concept of a two-dimensional Shape.
 *
 * @author Lukasz Bednarek
 * @version October 9, 2021
 */
public abstract class Shape2D {

    /**
     * Constructs the damn thing.
     */
    public Shape2D() { }

    /**
     * Draws the Shape.
     */
    public abstract void draw();

    /**
     * Retrieves the area of this Shape.
     *
     * @return Double area
     */
    public abstract double getArea();

    /**
     * Retrieves the perimeter of this Shape.
     *
     * @return
     */
    public abstract double getPerimeter();

    /**
     * Returns a String representation of this Shape.
     *
     * @return String representation of this Shape.
     */
    @Override
    public String toString() {
        return "Shape2D{}";
    }
}
