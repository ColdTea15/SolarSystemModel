# Solar System Model (OOP + GUI)

## Overview

This Java project demonstrates the use of **Object-Oriented Programming (OOP)** principles to model a solar system and visualize it through a simple **Graphical User Interface (GUI)**. Each planet is represented as an object with its own properties, and the system showcases how OOP concepts like encapsulation, inheritance, and polymorphism can be applied in a real-world simulation.

## Features

* **OOP Architecture**: Models planets using classes and inheritance.
* **Interactive GUI**: Displays the entire solar system in a window-based interface.
* **Scalable Design**: Easy to add more celestial bodies with minimal changes.
* **Realistic Layout**: Planets positioned with orbital spacing and scaling logic.

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
   java SolarSystemGUI
   ```

## File Structure

```
.
├── Planet.java             # Base class for all planets
├── SolarSystem.java        # Contains and manages all planet objects
├── SolarSystemGUI.java     # Renders the GUI and draws the solar system
├── README.md               # Project documentation
```

## Key OOP Concepts Demonstrated

* **Encapsulation**: Each celestial body manages its own state.
* **Inheritance**: Planets extend a base class with shared properties.
* **Polymorphism**: Rendering logic can treat all planets uniformly.
* **Abstraction**: Clear separation between data (SolarSystem) and view (GUI).

## Purpose

This project was built to showcase fundamental OOP understanding combined with basic GUI development in Java. It serves as a learning exercise in both software design and graphical rendering.

## License

This project is licensed under the MIT License.

## Author

* **GitHub**: [ColdTea15](https://github.com/ColdTea15)
