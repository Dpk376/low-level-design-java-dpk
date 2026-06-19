# ☕ Java Low-Level Design (LLD) Portfolio

Welcome to my Java Low-Level Design repository! This project serves as a comprehensive portfolio demonstrating my ability to write clean, extensible, and production-grade code using advanced Object-Oriented Design (OOD) principles, Design Patterns, and Java 17 features.

The repository is structured as an enterprise-grade Maven Multi-Module project. You can clone it, open it in any modern IDE (IntelliJ, Eclipse, VS Code), and instantly start exploring the code.

---

## 🏗️ Repository Architecture

Each module in this repository focuses on a specific engineering concept or system design challenge.

### 1. [Design Patterns](./DesignPatterns)
A deep dive into the "Gang of Four" design patterns, implemented with real-world scenarios.
- **Creational:** Builder, Factory, Prototype, Registry, Singleton
- **Structural:** Adapter, Decorator, Facade, Flyweight
- **Behavioral:** Strategy, Observer (integrated across projects)

### 2. [Solid Principles](./SolidPrinciples)
Practical implementations showcasing the five SOLID principles of object-oriented design. The code demonstrates how to refactor tightly-coupled legacy code into modular, maintainable components.

### 3. [Multithreading](./Multithreading)
Advanced concurrency patterns in Java.
- **Synchronization:** Locks, synchronized blocks, and thread safety.
- **Semaphores:** Implementing producer-consumer queues and managing resource pools.
- **Parallel Algorithms:** Multi-threaded Merge Sort using Fork/Join and Executors.

### 4. [Object-Oriented Programming (OOPS)](./OOPS-1)
Core concepts broken down into modular packages:
- **OOPS-1:** Classes, Objects, and memory management.
- **OOPS-2:** Inheritance, Polymorphism, and method overriding.
- **OOPS-3:** Abstraction, Interfaces, and the `static` keyword.

### 5. [Streams & Lambdas](./StreamsAndLambdas)
Modern Java functional programming. Demonstrates data processing, filtering, and aggregation using the Java Streams API and Lambda expressions.

### 6. [Generics](./Generics)
Type-safe programming in Java. Demonstrates custom generic classes (like generic `Pair` tuples) and bounded type parameters.

### 7. [Exception Handling](./ExceptionHandling)
Robust error management, demonstrating custom exceptions, try-catch-finally blocks, and fail-fast validation mechanisms.

---

## 🎮 Featured Projects

### [TicTacToe Engine](./TicTacToe)
A fully functional, extensible TicTacToe game engine built from scratch.
- **Key Patterns:** Strategy (for winning rules and Bot AI), Builder (for game instantiation), Factory (for Bot creation).
- **Features:** Supports `N x N` board sizes, undo functionality with `O(1)` state restoration, and algorithmic Bot opponents.

### [Library Management System](./LibraryManagementSystem)
A domain-driven design modeling a real-world library.
- **Entities:** Books, Novels, Textbooks, Members, and Librarians.
- **Focus:** Demonstrates inheritance, interface implementation (`Lendable`), and domain modeling.

---

## 🚀 Getting Started

### Prerequisites
- **Java:** JDK 17 or higher
- **Maven:** 3.8+ (for building the project)

### Building the Project
Because this is a Maven Multi-Module project, you can compile and run tests for the entire repository with a single command:

```bash
# Clone the repository
git clone https://github.com/Dpk376/low-level-design-java-dpk.git
cd low-level-design-java-dpk

# Compile and run all tests
mvn clean test
```

### Running Specific Modules
If you want to run a specific module (e.g., the TicTacToe game), navigate to its directory and run the client:
```bash
cd TicTacToe
mvn clean compile
# Run the Client class using your IDE or the java command
```

---

## 💡 Google Engineering Standards Applied
Throughout this repository, I have strictly adhered to industry best practices:
- **Clean Code:** Meaningful variable names, single-responsibility methods, and no "magic numbers".
- **Documentation:** Javadocs explaining not just *what* the code does, but *why* specific design decisions and trade-offs were made.
- **Fail-Fast Design:** Extensive use of validations and custom exceptions to prevent invalid states (e.g., Game Builder validations).
- **Immutability:** Use of `final` keywords and immutable structures where applicable to prevent side effects.

---
*Feel free to explore the code, open an issue if you spot a bug, or reach out if you'd like to discuss system design!*
