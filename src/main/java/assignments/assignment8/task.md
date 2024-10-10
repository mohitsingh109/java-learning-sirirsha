
# Java Exception Handling Assignment

**Objective**:  
The purpose of this assignment is to help students understand and work with Java Exception Handling. Students will work with both **checked (compile-time)** and **unchecked (runtime)** exceptions and create their own custom exceptions.

---

## Scenario:
You are tasked with developing a small banking application that manages accounts and processes transactions. While doing so, you will handle different exceptions such as invalid transactions and insufficient balance using both built-in and custom exceptions.

## Requirements:

### 1. Define the `BankAccount` Class
- Define a `BankAccount` class with the following attributes:
    - `String accountNumber`
    - `double balance`
- Implement the following methods:
    - `void deposit(double amount)` - adds the amount to the balance.
    - `void withdraw(double amount)` - deducts the amount from the balance (handling insufficient balance with custom exceptions).
    - `double getBalance()` - returns the current balance.

### 2. Handle **Checked Exceptions**
- Create a method `void openAccount(String accountNumber)` that throws a checked exception `AccountAlreadyExistsException` if an account with the same account number already exists.
- **Exception:** Define `AccountAlreadyExistsException` as a custom checked exception by extending `Exception`.

### 3. Handle **Unchecked Exceptions**
- Create a method `void transfer(BankAccount toAccount, double amount)` that transfers money from one account to another. If the amount exceeds the balance, throw an `InsufficientFundsException`.
- **Exception:** Define `InsufficientFundsException` as a custom unchecked exception by extending `RuntimeException`.

### 4. Handle Built-in Exceptions
- Ensure that your program can handle `ArithmeticException` when dividing by zero in calculations.
- Ensure that `NullPointerException` is handled when trying to transfer to a null account.

---

## Tasks:

### 1. Create the `BankAccount` class:
```java
public class BankAccount {
    

    public void withdraw(double amount) throws InsufficientFundsException {
    }
    
    public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException {
    }
}
```

### 2. Create Custom Exceptions:

- **Custom Checked Exception:**
```java
public class AccountAlreadyExistsException extends Exception {
    public AccountAlreadyExistsException(String message) {
        super(message);
    }
}
```

- **Custom Unchecked Exception:**
```java
public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
```

### 3. Simulate Bank Transactions:
- Create a test class `BankApplication` where:
    - You open accounts.
    - You attempt to withdraw an amount greater than the balance and catch the `InsufficientFundsException`.
    - You try transferring money to a null account and handle the `NullPointerException`.
    - You handle `AccountAlreadyExistsException` when trying to open an account with a duplicate account number.

