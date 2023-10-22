public class Planets extends SolarObject{
    /**
     * The Planets class represents a planet in a solar system simulation, extending SolarObject.
     * It defines the planet's position, size, color, and orbit speed.
     */
    private double speed;
    public Planets(double distance, double angle, double diameter, String col,SolarSystem s,double speed)
    {
        /**
         * Creates a new instance of the Planets class, representing a planet in the solar system.
         *
         * @param distance The distance of the planet from the center of the solar system.
         * @param angle The initial angle of the planet in degrees.
         * @param diameter The size (diameter) of the planet.
         * @param col The color of the planet.
         * @param s The SolarSystem instance to which the planet belongs.
         * @param speed The speed at which the planet orbits around the sun.
         */
        super(distance,angle,diameter,col,s);
        this.speed = speed;
    }

    //orbit function that requires speed and adjust the orbit speed accordingly
    public void orbit()
    {
        /**
         * Updates the planet's angle to simulate its orbit around the sun.
         * The orbit speed is determined by the speed parameter.
         */
        double x = speed * 0.1;
        double newAngle = getAngle() + x;
        setAngle(newAngle); // Update the angle using the setter method
    }

    public double getSpeed()
    {
        /**
         * Gets the current orbit speed of the planet.
         *
         * @return The planet's orbit speed.
         */
        return speed;
    }

    public void setSpeed(double speed)
    {
        /**
         * Sets the orbit speed of the planet.
         *
         * @param speed The new orbit speed to set.
         */
        this.speed = speed;
    }
}
