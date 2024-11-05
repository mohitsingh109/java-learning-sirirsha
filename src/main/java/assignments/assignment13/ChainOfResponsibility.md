# Java Assignment: Chain of Responsibility Pattern

## Scenario
You are developing a customer support ticketing system that routes support requests to different levels of support staff based on the complexity of the issue. The support staff includes a Junior Support Agent, a Senior Support Agent, and a Technical Support Engineer. Each level can handle specific types of issues, and if one cannot resolve the issue, it should pass the ticket to the next level. To implement this functionality, you decide to use the Chain of Responsibility Pattern.

## Assignment Instructions
1. **Implement the Chain of Responsibility**:
    - Create an abstract class `SupportAgent` that has a reference to the next agent in the chain and a method `handleRequest(Ticket ticket)`.
    - Implement concrete classes for each support level:
        - `JuniorSupportAgent` that can handle basic issues.
        - `SeniorSupportAgent` that can handle more complex issues.
        - `TechnicalSupportEngineer` that can handle advanced technical issues.
    - In each class, implement the `handleRequest()` method to either resolve the issue or pass it to the next agent.

2. **Demonstrate the Chain of Responsibility Usage**:
    - Write a main application class that creates instances of the support agents and links them to form a chain.
    - Simulate different support tickets and demonstrate how the system processes these tickets through the chain of support agents.

3. **Unit Testing**:
    - Write unit tests to ensure that the ticket requests are correctly routed to the appropriate support agents and handled as expected.

## Interview Question
**Question**: Can you explain the Chain of Responsibility Pattern and its advantages in software design? How does it promote loose coupling between sender and receiver? Provide an example scenario where this pattern is particularly effective in real-world applications.