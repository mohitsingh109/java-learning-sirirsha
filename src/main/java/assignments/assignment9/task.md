
# Java Generics Assignment

**Objective**:  
This assignment will help students understand and apply the concept of Generics in Java. By using generics, students will create type-safe and reusable code that can work with any object type.

---

## Scenario:
You are tasked with developing a small library management system that can store books and members using generic classes. The system will also include a utility class that provides methods for sorting and searching collections of objects using generics.

## Requirements:

### 1. Define a Generic Class `Library<T>`
- Create a generic class `Library<T>` that can store items of type `T`.
    - Add methods to:
        - `add(T item)` - Adds an item to the library.
        - `remove(T item)` - Removes an item from the library.
        - `getAll()` - Returns a list of all items in the library.

### 2. Define `Book` and `Member` Classes
- Define two classes, `Book` and `Member`, which represent items that will be stored in the `Library<T>`.
    - `Book` attributes: `String title`, `String author`.
    - `Member` attributes: `String name`, `int memberId`.
    - Override the `toString()` method to provide a readable output for both `Book` and `Member`.

### 3. Use Wildcards with Generics
- Create a method `printLibrary(Library<? extends Object> library)` that prints all items in the library regardless of their type. Use the `?` wildcard to allow any object type.

### 4. Create a Generic Utility Class `LibraryUtils`
- Create a generic utility class `LibraryUtils` that includes:
    - A generic method `T findMax(List<T> list, Comparator<? super T> comparator)` to find the maximum item in a list based on a provided comparator.
    - A method `void sortItems(List<T> list, Comparator<? super T> comparator)` to sort a list of items based on a comparator.

### 5. Test the Library and Utility Classes
- In the `LibraryApplication` class, create instances of `Library<Book>` and `Library<Member>`.
    - Add and remove books and members from the respective libraries.
    - Use `LibraryUtils` to sort the books by title and find the member with the highest `memberId`.

---
