# Java Assignment: Facade Pattern

## Scenario
You are developing a banking application that allows users to manage their accounts, apply for loans, and transfer funds. The application involves multiple subsystems such as account management, loan processing, and transaction processing. To simplify user interactions with these complex subsystems, you decide to implement the Facade Pattern.

## Assignment Instructions
1. **Implement the Facade Class**:
    - Create classes for each subsystem:
        - `AccountService` that handles account operations (e.g., `createAccount()`, `getAccountDetails()`).
        - `LoanService` that manages loan applications (e.g., `applyForLoan()`, `checkLoanStatus()`).
        - `TransactionService` that processes transactions (e.g., `transferFunds()`).
    - Create a `BankingFacade` class that provides a simplified interface to these subsystems. The facade should have methods like `openAccount(String customerName)`, `applyForLoan(String customerName, double amount)`, and `transferMoney(String fromAccount, String toAccount, double amount)`.

2. **Demonstrate the Facade Usage**:
    - Write a main application class that creates a `BankingFacade` object and allows users to perform banking operations through simple method calls.
    - Show how the facade simplifies interactions with multiple banking services.

3. **Unit Testing**:
    - Write unit tests to ensure that the `BankingFacade` works correctly and that all operations are performed as expected when using the facade methods.

## Interview Question
**Question**: Can you explain the Facade Pattern and its role in reducing complexity in software systems? What are the advantages of using a facade over directly accessing the subsystems? Provide an example scenario where this pattern enhances the user experience.
