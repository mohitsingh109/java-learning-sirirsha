## Assignment: Integrating Polymorphism, Encapsulation, and Abstraction in Java

**Objective:** The objective of this assignment is to demonstrate a comprehensive understanding of key object-oriented programming concepts in Java, including Polymorphism, Encapsulation, and Abstraction. Through the development of a Java program, you will apply these concepts in a practical context, showcasing their utility in real-world software development.

**Instructions:**

Design and implement a Java program for managing a library system. Your program should incorporate the following functionalities:

1. **Polymorphism:**
    - Implement a superclass `LibraryItem` representing items available in the library, such as books, magazines, and DVDs.
        - Data Members:
            - `String title`: Title of the library item.
            - `String author`: Author of the library item.
            - `String ISBN`: International Standard Book Number or unique identifier.
            - `boolean isCheckedOut`: Indicates if the item is currently checked out.
        - Functions:
            - `void checkOut()`: Marks the item as checked out.
            - `void returnItem()`: Marks the item as returned.
    - Create subclasses for different types of library items, such as `Book`, `Magazine`, and `DVD`, each inheriting from the `LibraryItem` superclass.
        - Additional Data Members:
            - `int pageCount` (for `Book`)
            - `String publisher` (for `Book`)
            - `int issueNumber` (for `Magazine`)
            - `int releaseYear` (for `DVD`)
        - Additional Functions:
            - `void displayDetails()`: Displays detailed information about the specific type of library item.

2. **Encapsulation:**
    - Encapsulate the attributes of each library item class using appropriate access modifiers (`private`, `protected`, `public`).
    - Provide accessor (getter) and mutator (setter) methods where necessary to access and modify the encapsulated data.
    - Ensure that access to sensitive data is controlled through proper encapsulation, preventing unauthorized modification from external sources.

3. **Abstraction:**
    - Define an abstract class `LibraryUser` to represent users of the library system. This class should include common attributes and methods for all types of library users.
        - Data Members:
            - `String name`: Name of the library user.
            - `int userID`: Unique identifier for the user.
        - Functions:
            - `abstract void borrowItem(LibraryItem item)`: Abstract method to borrow a library item.
            - `abstract void returnItem(LibraryItem item)`: Abstract method to return a library item.
    - Implement concrete subclasses for different types of library users, such as `Student`, `Faculty`, and `Guest`, each inheriting from the `LibraryUser` abstract class.
        - Additional Data Members:
            - `String department` (for `Student` and `Faculty`)
            - `int maxItemsAllowed` (for `Student` and `Faculty`)
        - Additional Functions:
            - `void displayUserInfo()`: Displays information specific to the type of library user.

4. **Integration:**
    - Create a main program (`LibrarySystem`) that simulates interactions within the library system.
    - Implement methods for adding new library items, registering new users, checking out items, returning items, and displaying information about items and users.
    - Demonstrate polymorphic behavior by treating objects of different subclasses uniformly through the use of superclass references.
    - Ensure proper encapsulation and abstraction principles are followed throughout the implementation.
