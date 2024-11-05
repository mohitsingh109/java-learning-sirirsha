# Java Assignment: Decorator Pattern

## Scenario
You are developing a subscription management system for a streaming service like Netflix. Users can customize their subscriptions by adding various features such as HD streaming, additional screens, and offline downloads. To implement this flexibility in adding different features to the subscription without modifying existing code, you decide to use the Decorator Pattern.

## Assignment Instructions
1. **Implement the Decorator Class**:
    - Create a `Subscription` interface with a method `cost()` that returns the price of the subscription.
    - Create a `BasicSubscription` class that implements the `Subscription` interface and represents a basic subscription plan.
    - Create an abstract decorator class `SubscriptionDecorator` that implements the `Subscription` interface and has a reference to a `Subscription` object.
    - Implement concrete decorators such as `HDStreamingDecorator`, `AdditionalScreensDecorator`, and `OfflineDownloadsDecorator` that extend `SubscriptionDecorator` to add additional functionalities (e.g., adding the cost of HD streaming, additional screens, or offline downloads).

2. **Demonstrate the Decorator Usage**:
    - Write a main application class that allows users to create their subscription plans by selecting different decorators.
    - Show how the decorators can be combined to create various customized subscription plans and their total costs.

3. **Unit Testing**:
    - Write unit tests to ensure that the decorators work correctly and that the total cost calculations are accurate for various combinations of subscription plans.

## Interview Question
**Question**: Can you explain the Decorator Pattern and how it enhances the functionality of existing classes? What are the benefits of using the Decorator Pattern over inheritance for adding features? Provide an example scenario where this pattern would be beneficial.
