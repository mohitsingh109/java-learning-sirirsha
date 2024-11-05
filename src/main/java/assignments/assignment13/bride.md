# Java Assignment: Bridge Pattern

## Scenario
You are developing a drawing application that needs to support multiple shapes (e.g., Circle, Square) and various drawing APIs (e.g., SVG, PNG, or Canvas). The challenge is to allow the addition of new shapes and new drawing methods independently without altering existing code. To achieve this flexibility, you decide to implement the Bridge Pattern.

## Assignment Instructions
1. **Implement the Bridge Class**:
    - Create an interface `DrawingAPI` with methods like `drawCircle(double x, double y, double radius)` and `drawSquare(double x, double y, double side)`.
    - Implement different drawing API classes, such as:
        - `SVGAPI` that implements `DrawingAPI` and provides the actual drawing logic for SVG.
        - `PNGAPI` that implements `DrawingAPI` and provides the actual drawing logic for PNG.
    - Create an abstract class `Shape` that contains a reference to a `DrawingAPI`. This class should define methods like `draw()`, `resize(double percentage)`.
    - Implement concrete shape classes, such as `Circle` and `Square`, that extend `Shape` and implement the `draw()` method to use the `DrawingAPI` reference for drawing.

2. **Demonstrate the Bridge Usage**:
    - Write a main application class that creates instances of different shapes with different drawing APIs and demonstrates how to draw them.
    - Show how the Bridge Pattern allows you to add new shapes and new drawing methods independently.

3. **Unit Testing**:
    - Write unit tests to ensure that different shapes can be drawn using various drawing APIs, validating that the correct drawing logic is invoked.

## Interview Question
**Question**: Can you explain the Bridge Pattern and its role in achieving flexibility in software design? How does it separate abstraction from implementation? Provide an example scenario where the Bridge Pattern enhances the maintainability and scalability of a system.
