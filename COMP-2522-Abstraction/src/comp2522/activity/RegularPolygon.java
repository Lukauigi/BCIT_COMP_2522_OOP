package comp2522.activity;

/**
 * Represents a Regular Polygon object.
 *
 * @author LukeB
 * @version October 2021
 */
public class RegularPolygon extends Polygon {

    private final double length;
    private final double apothem;

    public RegularPolygon(final int initialSides, final double initialLength, final double initialApothem) {
        super(initialSides);
        this.length = initialLength;
        this.apothem = initialApothem;
    }

    @Override
    public void draw() {
        System.out.println("<>");
    }

    @Override
    public double getPerimeter() {
        return this.length * super.sides;
    }

    @Override
    public double getArea() {
        return (super.sides * this.length * this.apothem) / 2;
    }

}
