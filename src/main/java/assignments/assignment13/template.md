# Java Assignment: Template Method Pattern

## Scenario
You are developing a cooking application that provides users with different types of recipes. Each recipe follows a specific sequence of steps, but the details of some steps can vary depending on the recipe. To standardize the recipe process while allowing for variations, you decide to implement the Template Method Pattern.

## Assignment Instructions
1. **Create an Abstract Class**:
    - Create an abstract class `Recipe` that defines the template method `prepareRecipe()`. This method should outline the steps of the recipe and call abstract methods for the steps that can vary.
    - Define the following methods in the `Recipe` class:
        - `boilWater()`: a concrete method that prints "Boiling water".
        - `addIngredients()`: an abstract method that will be implemented by subclasses to add specific ingredients.
        - `cook()`: an abstract method that will be implemented by subclasses to define the cooking process.
        - `serve()`: a concrete method that prints "Serving the dish".

2. **Concrete Recipe Classes**:
    - Create concrete classes that extend `Recipe` for different types of recipes:
        - `PastaRecipe` that implements `addIngredients()` and `cook()` methods specifically for pasta preparation.
        - `TeaRecipe` that implements `addIngredients()` and `cook()` methods specifically for tea preparation.

3. **Demonstrate the Template Method Usage**:
    - Write a main application class that creates instances of the `PastaRecipe` and `TeaRecipe`.
    - Call the `prepareRecipe()` method on both instances to show how the same sequence of steps is followed with specific implementations for each recipe.

4. **Unit Testing**:
    - Write unit tests to ensure that the `prepareRecipe()` method works correctly for both recipes and that each specific step is executed as expected.

## Interview Question
**Question**: Can you explain the Template Method Pattern and its advantages in defining a standard process while allowing for variations? How does it promote code reuse and reduce duplication? Provide an example scenario where the Template Method Pattern is beneficial in real-world applications, such as in a workflow or processing system.
