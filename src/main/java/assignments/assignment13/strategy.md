# Java Assignment: Strategy Pattern

## Scenario
You are developing a navigation system for a mobile app that provides users with various routing options based on different algorithms. The user can choose to navigate using the fastest route, the shortest route, or a scenic route. To implement this functionality, you decide to use the Strategy Pattern.

## Assignment Instructions
1. **Implement the Strategy Interface**:
    - Create an interface `RouteStrategy` with a method `buildRoute(String startLocation, String endLocation)` that defines how to build the route.
    - Implement different routing strategy classes:
        - `FastestRoute` that implements `RouteStrategy` and calculates the quickest route.
        - `ShortestRoute` that implements `RouteStrategy` and finds the shortest distance between two points.
        - `ScenicRoute` that implements `RouteStrategy` and suggests a route with scenic views and attractions.

2. **Context Class**:
    - Create a `Navigator` class that has a reference to a `RouteStrategy`. This class should have a method `setRouteStrategy(RouteStrategy strategy)` to set the current routing method and a method `navigate(String startLocation, String endLocation)` to execute the route building.

3. **Demonstrate the Strategy Usage**:
    - Write a main application class that creates instances of the routing strategy classes and allows users to choose a navigation strategy at runtime.
    - Show how the application calculates routes using the selected strategy without changing the route calculation implementation.

4. **Unit Testing**:
    - Write unit tests to ensure that the `Navigator` class correctly calculates routes using different strategies and that each routing algorithm works as expected.

## Interview Question
**Question**: Can you explain the Strategy Pattern and how it supports varying algorithms in an application? What are the advantages of using the Strategy Pattern for a navigation system? Provide an example scenario where this pattern enhances user experience in real-world applications.
