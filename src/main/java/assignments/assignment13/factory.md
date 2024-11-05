
# Java Assignment: Factory Design Pattern

## Scenario
You are developing a software application for a car dealership. The dealership sells different types of cars, including Sedans, SUVs, and Trucks. To streamline the process of creating different car objects, you decide to implement the Factory Design Pattern.

## Assignment Instructions
1. **Implement the Factory Class**:
    - Create a car interface named `Car` with a method `drive()`.
    - Create concrete classes `Sedan`, `SUV`, and `Truck` that implement the `Car` interface.
    - Create a `CarFactory` class that contains a method `createCar(String type)` which returns an instance of the appropriate `Car` subclass based on the provided type.

2. **Demonstrate the Factory Usage**:
    - Write a main application class that uses the `CarFactory` to create different types of cars based on user input or predefined conditions.
    - Show that the created car objects can be used to call the `drive()` method, demonstrating polymorphism.

3. **Unit Testing**:
    - Write unit tests to ensure that the `CarFactory` correctly creates instances of the various car types and that the `drive()` method behaves as expected for each type of car.

## Interview Question
**Question**: Can you explain how the Factory Design Pattern works? What are its benefits compared to other creation patterns? Can you provide a scenario where using the Factory Design Pattern is more advantageous than directly instantiating objects?
