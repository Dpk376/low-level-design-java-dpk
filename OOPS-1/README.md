# Object-Oriented Programming (OOP) - Part 1

Welcome to the **OOPS-1** module! In this module, we introduce the fundamental building blocks of Object-Oriented Programming in Java. 

## What is OOP?

Think of OOP as a way of modeling real-world entities in your code. Instead of writing long scripts of functions, we create "Objects" that hold both **data** (state) and **behavior** (methods).

### Classes and Objects (The Blueprint and the House)
- **Class**: A blueprint or a template. For example, `Student.java` is a blueprint. It dictates that every student will have a name, email, university name, and age.
- **Object**: A specific instance created from the blueprint. If `Student` is the blueprint, then "Deepak, who studies at MIT and is 25" is the object.

### Encapsulation (The Protective Shield)
Encapsulation is the practice of hiding the internal state of an object and requiring all interaction to be performed through an object's methods.

**Analogy**: Think of a `BankAccount`. You wouldn't want anyone to directly change your account balance by simply saying `account.balance = 1000000`. Instead, you interact with the bank through a teller (methods like `deposit()` and `withdraw()`). The teller verifies your request and updates the balance safely.

In our code:
- Fields in `BankAccount` and `Student` are marked as `private`.
- We provide `public` methods (getters and setters) to access and modify these fields safely.
- In `BankAccount.java`, `setBalance()` checks if the initial deposit is valid, preventing incorrect or malicious data from corrupting the state.

## Code Walkthrough

1. **`oops1.Student`**: Shows how to define a class, add fields (attributes), and use different constructors (default and parameterized) to create objects in various ways.
2. **`bank.BankAccount`**: Demonstrates strict encapsulation. The balance cannot be accessed directly; you must use `deposit()` or `withdraw()`, which contain validation logic to ensure the account doesn't go negative or receive invalid deposits.
3. **Clients**: The `Client.java` files act as our "main" programs where we create objects and interact with them, proving how our encapsulation rules hold up across different packages.

## Running Tests

To verify the logic, we have provided JUnit 5 tests. You can run them using the console standalone jar:
```bash
java -jar ../junit-platform-console-standalone.jar -cp src:test --scan-classpath
```
