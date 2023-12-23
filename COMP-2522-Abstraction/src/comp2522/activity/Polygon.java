package comp2522.activity;

/**
 * Represents an abstract concept of a Polygon.
 *
 * @author LukeB
 * @version October 2021
 */
public abstract class Polygon extends Shape2D {

    /**
     * Attribute number of sides of Polygon.
     */
    protected final int sides;

    /**
     * Constructs a Polygon object with number of sides.
     *
     * @param numberOfSides int of sides of Polygon
     */
    protected Polygon(final int numberOfSides) {
        this.sides = numberOfSides;
    }

    private int getSides() {
        return this.sides;
    }

}
