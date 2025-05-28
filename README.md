# Solar System Model (OOP + GUI)

## Overview

This Java project demonstrates the use of **Object-Oriented Programming (OOP)** principles to model a solar system and visualize it through a simple **Graphical User Interface (GUI)**. Each celestial object is represented as an object with its own properties, and the system showcases how OOP concepts like encapsulation, inheritance, and polymorphism can be applied in a real-world simulation.

## Features

* **OOP Architecture**: Models planets, moons, and solar objects using class hierarchy.
* **Interactive GUI**: Displays the entire solar system in a window-based interface.
* **Scalable Design**: Easily extensible to include more planets, moons, or features.
* **Realistic Layout**: Orbital spacing and basic visual representation of the solar system.

## Technologies Used

* Java
* Swing (for GUI)
* AWT (for rendering)

## How to Run

1. **Compile the Code**

   ```bash
   javac *.java
   ```

2. **Run the Main Class**

   ```bash
   java Main
   ```

## File Structure

```
.
├── Main.java               # Entry point to launch the GUI
├── Planets.java            # Defines planet-specific properties and behavior
├── Moon.java               # Defines moon objects extending solar object class
├── SolarObjects.java       # Base class for all solar system objects
├── SolarSystem.java        # Manages solar system data and celestial bodies
├── README.md               # Project documentation
```

## Key OOP Concepts Demonstrated

* **Encapsulation**: Each solar object maintains its own state and behavior.
* **Inheritance**: Planets and moons inherit from a base solar object class.
* **Polymorphism**: Rendering and simulation treat all solar objects uniformly.
* **Abstraction**: Logical separation between data representation and GUI rendering.

## Purpose

This project was built to showcase fundamental OOP understanding combined with GUI programming in Java. It serves as a visual and practical demonstration of clean software design, modular architecture, and object interaction.

## License

This project is licensed under the MIT License.

## Author

* **GitHub**: [ColdTea15](https://github.com/ColdTea15)
