## Assignment: Integrating Arrays and Interfaces in Java

**Objective:** The objective of this assignment is to apply your knowledge of Arrays and Interfaces in Java to develop a comprehensive program. By integrating these concepts, you will gain practical experience in managing data collections and implementing modular, polymorphic code structures.

**Instructions:**

Design and implement a Java program for managing a student information system. Your program should incorporate the following functionalities, utilizing Arrays for data storage and Interfaces for defining contracts:

1. **Student Management System:**
    - Design a superclass `Student` to represent individual student records in the system.
        - Data Members:
            - `protected String name`: Name of the student.
            - `protected int ID`: Unique identifier for the student.
            - `protected int age`: Age of the student.
            - `protected String grade`: Grade of the student.
    - Implement a constructor to initialize the data members and appropriate getter and setter methods for accessing and modifying the data.

2. **Interfaces for Data Manipulation:**
    - Define an interface called `DataManipulation` with the following methods:
        - `void addStudent(Student student)`: Adds a new student record to the system.
        - `void removeStudent(int ID)`: Removes a student record based on the ID.
        - `Student searchStudent(String name)`: Searches for a student record by name and returns the corresponding student object.
    - Implement the `DataManipulation` interface in a class called `StudentDatabase`, which will serve as the central data repository for student information.
        - Data Members:
            - `protected Student[] students`: Array to store instances of student objects.
            - `protected int size`: Current size of the student database.
    - Override the interface methods in the `StudentDatabase` class to provide functionality for adding, removing, and searching student records using the array.

3. **User Interaction:**
    - Develop a user interface class called `UserInterface` that allows users to interact with the student management system.
        - Implement methods for adding new students, removing existing students, searching for students by name, and displaying all student records.
    - Utilize an instance of the `StudentDatabase` class within the `UserInterface` class to access and manipulate student records.

4. **Integration of Concepts:**
    - Demonstrate the use of arrays for storing and manipulating collections of student records within the `StudentDatabase` class.
    - Implement methods from the `DataManipulation` interface to add, remove, and search for student records, ensuring polymorphic behavior.
    - Ensure that the program follows best practices for code organization, encapsulation, and abstraction.
