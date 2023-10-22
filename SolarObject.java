import java.awt.*;

/**
 * The `SolarObject` class represents astronomical objects in a solar system simulation.
 * These objects can be planets, moons, or any other general celestial objects.
 *
 * @author colmantee
 */
public class SolarObject {
    protected double distance, angle, diameter, x, y;
    private String col;
    private SolarSystem s;

    /**
     * Creates a new instance of the SolarObject class, representing an astronomical object
     * in a solar system simulation.
     *
     * @param distance The distance of the object from the center of the solar system.
     * @param angle The initial angle of the object in degrees.
     * @param diameter The size (diameter) of the object.
     * @param col The color of the object.
     * @param s The SolarSystem instance to which the object belongs.
     */
    public SolarObject(double distance, double angle, double diameter, String col, SolarSystem s) {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
        this.s = s;
    }

    /**
     * Draws the solar object on the graphical user interface.
     * The object is rendered using the specified distance, angle, diameter, and color.
     */
    public void draw() {
        s.drawSolarObject(distance, angle, diameter, col);
    }

    /**
     * Draws rings around the solar object on the graphical user interface.
     * The rings consist of an outer ring (gray) and an inner empty space (black).
     */
    public void drawRings() {
        double ringDiameter = diameter * 1.5;
        double innerDiameter = diameter * 1.2;
        s.drawSolarObject(distance, angle, ringDiameter, "GRAY");
        s.drawSolarObject(distance, angle, innerDiameter, "BLACK");
    }

    /**
     * Gets the distance of the solar object from the center of the solar system.
     * @return The distance of the object.
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Sets the angle of the solar object.
     * @param angle The new angle in degrees.
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**
     * Gets the current angle of the solar object.
     * @return The current angle in degrees.
     */
    public double getAngle() {
        return angle;
    }

    /**
     * Gets the color of the solar object.
     * @return The color of the object.
     */
    public String getColor() {
        return col;
    }
}
