
# Java Assignment: Singleton Pattern

## Scenario
You are tasked with designing a logging utility for a Java application. The application will have multiple components that need to log messages. To ensure that all components share a single logging instance (to avoid issues like duplicate log entries or inconsistent logging), you decide to implement the Singleton pattern.

## Assignment Instructions
1. **Implement the Singleton Class**:
    - Create a class named `Logger` that implements the Singleton pattern.
    - Ensure that the class provides a method to log messages, which includes a timestamp with each entry.
    - The logger should be thread-safe to handle concurrent logging from different components.

2. **Demonstrate the Logger Usage**:
    - Create a sample application that simulates multiple components (e.g., `ComponentA`, `ComponentB`) that use the `Logger` instance to log messages.
    - Show that all components log their messages to a single instance of the `Logger`.

3. **Unit Testing**:
    - Write unit tests to ensure that the `Logger` instance remains a singleton and that logging functionality works as expected.

## Interview Question
**Question**: Can you explain how you would implement a Singleton pattern in Java? What are the advantages and disadvantages of using this pattern? Additionally, can you describe a situation in which you would use the Singleton pattern in a real-world application?
