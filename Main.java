import java.util.*;
public class Main {
    /**
     * This is the main class for a solar system simulation. It initializes and controls the simulation.
     */
    public static void main(String[] args) {
        Random random = new Random();
        SolarSystem s = new SolarSystem(900,900);
        SolarObject sun = new SolarObject(0, 0, 65, "YELLOW",s);
        Planets mars = new Planets(155,100,20,"RED",s,20);
        Planets earth = new Planets(105,0,30,"BLUE",s,25);
        Planets mercury = new Planets(45,30,15,"#B7B8B9",s,40);
        Planets venus = new Planets(70,200,25,"ORANGE",s,35);
        Planets jupiter = new Planets(215,150,48,"#bcafb2",s,15);
        Planets saturn = new Planets(290,300,45,"#ead6b8",s,12);
        Planets uranus = new Planets(350,70,40,"#ACE5EE",s,8);
        Planets neptune = new Planets(400,250,35,"#4b70dd",s,6);
        Moon moon = new Moon(23,10,10,"GRAY",s, earth);
        Moon galilean = new Moon(33,10,10,"GRAY",s, jupiter);

        Planets[] asteroid = new Planets[150];

        for (int i = 0; i < asteroid.length; i++) {
            // Adjust the distance for each asteroid to be between 170 and 180
            double distance = 170 + Math.random() * 10; // Generate random value between 170 and 180
            // Generate a random speed between 10 and 20 (adjust as needed)
            double speed = 10 + random.nextDouble() * 10;
            // Generate a random angle between 0 and 360 degrees
            double angle = random.nextDouble() * 360;
            // Create an asteroid with specified parameters and add it to the array
            asteroid[i] = new Planets(distance, angle, 5, "WHITE",s,speed);
        }

        // The simulation loop, where all celestial objects are drawn and their orbits are updated
        while(true){
            sun.draw(); //draw sun
            //draw planets
            earth.draw();
            mars.draw();
            mercury.draw();
            venus.draw();
            jupiter.draw();
            saturn.draw(); //draw saturn
            saturn.drawRings(); //draw saturn ring which will blocked/covered the whole saturn
            saturn.draw(); //draw another same saturn which would be on top of saturn ring
            uranus.draw();
            neptune.draw();

            moon.draw(); //draw moons
            galilean.draw();

            earth.orbit(); //planets orbit
            mars.orbit();
            mercury.orbit();
            venus.orbit();
            jupiter.orbit();
            saturn.orbit();
            uranus.orbit();
            neptune.orbit();

            moon.orbit(); //moons orbit
            galilean.orbit();

            for (int i = 0; i < asteroid.length; i++) {
                asteroid[i].draw();
                asteroid[i].orbit();
            }

            s.finishedDrawing(); // Finish drawing for each iteration
        }
    }
}
