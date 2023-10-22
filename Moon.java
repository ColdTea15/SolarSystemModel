/**
 * This class is to create moon objects in the Solar System Model
 * Inheritances from Solar Object class
 * @author colmantee
 */
class Moon extends SolarObject
{
    private double centreOfRotationDistance, centreOfRotationAngle;
    SolarSystem s;
    private Planets p;

    public Moon(double distance, double angle, double diameter, String col, SolarSystem s, Planets p)
    {
        /**
         * This is the Moon constructor, which uses the super keyword to inherit parameters from SolarObject.
         *
         * @param distance How far away the moon is from the planet it is orbiting around.
         * @param angle The angle of the moon relative to the planet.
         * @param diameter The size of the moon.
         * @param col The color of the moon.
         * @param s The SolarSystem instance.
         * @param p The planet around which the moon orbits.
         */
        super(distance, angle, diameter,col,s);
        this.s = s;
        this.p = p;
    }

    public void draw()
    {
        /**
         * Draws the moon in the graphical user interface, positioning it around a planet.
         *
         * @param p The planet around which the moon orbits.
         */
        s.drawSolarObjectAbout(distance,angle,diameter,getColor(),p.getDistance(),p.getAngle());
    }
    public void orbit()
    {
        /**
         * This method is used for the moon to orbit/move around the planet it is set to.
         *
         * @param speed The speed at which the moon orbits around the planet.
         * The method calculates a new angle based on the current angle and the specified speed.
         * The new angle is then set using the setter method setAngle(newAngle).
         */
        double x = 10;
        double newAngle = getAngle() + x;
        setAngle(newAngle);
    }
}


