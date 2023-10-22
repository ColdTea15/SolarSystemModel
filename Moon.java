/**
 * This class represents moon objects in the Solar System Model.
 * It inherits from the SolarObject class and is used to create and manage moons in the simulation.
 * @author colmantee
 */
public class Moon extends SolarObject {
    private double centreOfRotationDistance, centreOfRotationAngle;
    SolarSystem s;
    private Planets p;

    /**
     * Constructs a new Moon object that orbits around a planet.
     * @param distance The distance of the moon from the planet it is orbiting around.
     * @param angle The angle of the moon relative to the planet in degrees.
     * @param diameter The size (diameter) of the moon.
     * @param col The color of the moon.
     * @param s The SolarSystem instance in which the moon exists.
     * @param p The planet around which the moon orbits.
     */
    public Moon(double distance, double angle, double diameter, String col, SolarSystem s, Planets p) {
        super(distance, angle, diameter, col, s);
        this.s = s;
        this.p = p;
    }

    /**
     * Draws the moon on the graphical user interface, positioning it around the specified planet.
     * p is the planet around which the moon orbits, used to determine the moon's position.
     */
    public void draw() {
        s.drawSolarObjectAbout(distance, angle, diameter, getColor(), p.getDistance(), p.getAngle());
    }

    /**
     * Simulates the moon's orbit around its associated planet.
     * speed = the speed at which the moon orbits around the planet.
     * The method calculates a new angle based on the current angle and the specified speed.
     * The new angle is then set using the setter method setAngle(newAngle).
     */
    public void orbit() {
        double x = 10; // Adjust the speed here as needed
        double newAngle = getAngle() + x;
        setAngle(newAngle);
    }
}
