# Java Programming Assignment: Instance Variables, Getters, Setters, Access Modifiers, and Additional Methods

## Objectives:
- Understand how to define and use instance variables in Java.
- Learn how to create getter and setter methods.
- Implement methods with different access modifiers.
- Practice creating additional utility methods.

## Instructions:

1. **Create a Class**:
    - **Class Name**: `Book`

2. **Main Method**:
    - Implement the tasks within the `main` method of another class named `BookTest`.

## Scenario:
You are tasked with developing a Java class to represent a book. The class should have instance variables to store the book's details, provide getter and setter methods to access and modify these details, include methods with different access modifiers, and have a method to print the book's information.

### Tasks:

### 1. Define Instance Variables:
- Create instance variables for the following details of a book:
    - `String title`
    - `String author`
    - `Double price`
    - `Integer yearPublished`

### 2. Create Getter and Setter Methods:
- For each instance variable, create a getter method to retrieve its value and a setter method to modify its value.

### 3. Additional Methods with Different Access Modifiers:
#### a. Create a private method named `formatPrice`:
- **Return Type**: `String`
- **Functionality**: Return the price formatted as a string with a dollar sign (e.g., `$19.99`).

#### b. Create a public method named `discountedPrice`:
- **Parameters**: a double (`double discountPercentage`).
- **Return Type**: `double`
- **Functionality**: Return the price after applying the discount percentage.

#### c. Create a public method named `printDetails`:
- **Return Type**: `void`
- **Functionality**: Print all the instance variable values in a readable format.
  - For Printing price value use `formatPrice` function

### 4. Test the Class:
- Create a `BookTest` class with a `main` method to test the `Book` class.
- In the `main` method:
    - Create an instance of the `Book` class.
    - Set the instance variables using the setter methods.
    - Print the book's details using the `printDetails` method.
    - Print the discounted price using the `discountedPrice` method.
