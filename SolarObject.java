import java.awt.*;

/**
 * This class is to create any kind (generalist) of solar objects in the Solar System Model
 * @author colmantee
 */
class SolarObject
{
    protected double distance, angle, diameter,x,y;
    private String col;
    private SolarSystem s;

    public SolarObject(double distance, double angle, double diameter, String col,SolarSystem s)
    {
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
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
        this.s = s;
    }
    public void draw()
    {
        /**
         * Draws the solar object on the graphical user interface.
         * This method uses the specified distance, angle, diameter, and color to render the object.
         */
        s.drawSolarObject(distance,angle,diameter,col);
    }

    public void drawRings()
    {
        /**
         * Draws rings around the solar object on the graphical user interface.
         * The rings consist of an outer ring (gray) and an inner empty space (black).
         */
        double ringDiameter = diameter*1.5;
        double innerDiameter = diameter*1.2;
        s.drawSolarObject(distance,angle,ringDiameter,"GRAY");
        s.drawSolarObject(distance,angle,innerDiameter,"BLACK");
    };
    public double getDistance()
    {
        /**
         * Gets the distance of the solar object from the center of the solar system.
         *
         * @return The distance of the object.
         */
        return distance;
    }
    public void setAngle(double angle)
    {
        /**
         * Sets the angle of the solar object.
         *
         * @param angle The new angle in degrees.
         */
        this.angle = angle;
    }
    public double getAngle()
    {
        /**
         * Gets the current angle of the solar object.
         *
         * @return The current angle in degrees.
         */
        return angle;
    }
    public String getColor()
    {
        /**
         * Gets the color of the solar object.
         *
         * @return The color of the object.
         */
        return col;
    }
}