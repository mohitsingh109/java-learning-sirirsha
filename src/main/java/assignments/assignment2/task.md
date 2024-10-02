# Java Programming Assignment: Constructors, Instance Variables, Methods, Static Members, and Constructor Overloading

## Objectives:
- Understand how to define and use constructors in Java.
- Learn how to create and use instance variables.
- Implement methods and understand their functionality.
- Learn and use static members.
- Understand and implement constructor overloading.

## Instructions:

1. **Create a Class**:
    - **Class Name**: `Student`

2. **Main Method**:
    - Implement the tasks within the `main` method of another class named `StudentTest`.

## Scenario:
You are tasked with developing a Java class to represent a student. The class should have instance variables to store the student's details, constructors to initialize these details (including overloaded constructors), methods to access and modify the details, and static members to keep track of the total number of students created and the average GPA.

### Tasks:

### 1. Define Instance Variables:
- Create instance variables for the following details of a student:
    - `String name`
    - `int age`
    - `String studentID`
    - `double gpa`

### 2. Constructors:
#### a. Default Constructor:
- Initialize the instance variables to default values.

#### b. Parameterized Constructor:
- **Parameters**: `String name`, `int age`, `String studentID`, `double gpa`.
- Initialize the instance variables using the provided values.

#### c. Overloaded Constructor:
- **Parameters**: `String name`, `int age`, `String studentID`.
- Initialize the `name`, `age`, and `studentID` instance variables using the provided values. Set the `gpa` to a default value (e.g., `0.0`).

### 3. Create Getter and Setter Methods:
- For each instance variable, create a getter method to retrieve its value and a setter method to modify its value.

### 4. Additional Methods:
#### a. Create a public method named `isHonorRoll`:
- **Return Type**: `boolean`
- **Functionality**: Return `true` if the student's GPA is 3.5 or higher, otherwise return `false`.

#### b. Create a public method named `printDetails`:
- **Return Type**: `void`
- **Functionality**: Print all the instance variable values in a readable format.

### 5. Static Members:
#### a. Create a static variable named `totalStudents`:
- **Type**: `int`
- **Functionality**: Keep track of the total number of `Student` objects created.

#### b. Create a static variable named `totalGPA`:
- **Type**: `double`
- **Functionality**: Keep track of the sum of all students' GPA.

#### c. Create a static method named `getAverageGPA`:
- **Return Type**: `double`
- **Functionality**: Return the average GPA of all students.

#### d. Increment `totalStudents` and update `totalGPA`:
- Increment the `totalStudents` variable and update `totalGPA` in all constructors to count each created `Student` object and sum their GPA.

### 6. Test the Class:
- Create a `StudentTest` class with a `main` method to test the `Student` class.
- In the `main` method:
    - Create multiple instances of the `Student` class using all constructors.
    - Set the instance variables using the setter methods.
    - Print the student's details using the `printDetails` method.
    - Check if the student is on the honor roll using the `isHonorRoll` method.
    - Print the total number of students using the static variable `totalStudents`.
    - Print the average GPA using the `getAverageGPA` method.
