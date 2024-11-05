
# Java Assignment: Builder Pattern

## Scenario
You are tasked with creating a complex object representation for a meal ordering system in a restaurant. The meal can consist of various components such as appetizers, main courses, beverages, and desserts. To create this complex object easily and flexibly, you decide to implement the Builder Pattern.

## Assignment Instructions
1. **Implement the Builder Class**:
    - Create a class named `Meal` with fields for `appetizer`, `mainCourse`, `beverage`, and `dessert`.
    - Implement a `MealBuilder` class that provides methods to set each component of the meal (e.g., `setAppetizer()`, `setMainCourse()`, `setBeverage()`, `setDessert()`) and a method `build()` that returns the constructed `Meal` object.

2. **Demonstrate the Builder Usage**:
    - Write a main application class that uses the `MealBuilder` to create different meal combinations based on user input or predefined scenarios.
    - Show how the builder can create various meal combinations flexibly and clearly.

3. **Unit Testing**:
    - Write unit tests to ensure that the `MealBuilder` constructs `Meal` objects correctly and that the various meal combinations are as expected.

## Interview Question
**Question**: Can you explain the Builder Pattern and its advantages in creating complex objects? In what scenarios would you choose the Builder Pattern over other creational patterns like the Factory Pattern?
