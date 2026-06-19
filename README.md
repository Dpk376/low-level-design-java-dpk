# Low Level Design (LLD) - Backend Course (April 2026)

Welcome to the comprehensive code repository for the Low-Level Design Backend course! This repository contains all the code examples, patterns, and principles discussed throughout the course, refactored to meet **Google-level readability and engineering standards**.

Whether you are a beginner looking to understand basic object-oriented concepts, a junior engineer studying design patterns, or a senior developer preparing for a grueling system design interview, this repository serves as a master reference guide.

## 📚 Repository Structure & Learning Path

The repository is organized into distinct modules, progressing from foundational object-oriented programming (OOP) to advanced concurrency and architectural design patterns. 

We recommend following this path for the best learning experience:

### Phase 1: Core Object-Oriented Programming (OOP)
1. **[OOPS-1: Classes, Objects, and Encapsulation](./OOPS-1/README.md)**
   - Understand the building blocks of Java.
   - Learn how to protect data integrity using access modifiers (Encapsulation).
2. **[OOPS-2: Copy Constructors, Inheritance, and Polymorphism](./OOPS-2/README.md)**
   - Master object copying (shallow vs. deep copies).
   - Learn how classes inherit state and behavior.
   - Understand compile-time (method overloading) polymorphism.
3. **[OOPS-3: Abstract Classes, Interfaces, and Static](./OOPS-3/README.md)**
   - Define contracts using interfaces and abstract classes.
   - Grasp runtime (method overriding) polymorphism.
   - Learn about class-level state with the `static` keyword.

### Phase 2: Intermediate Java Concepts
4. **[Exception Handling](./ExceptionHandling/README.md)**
   - Learn how to build resilient software that doesn't crash on bad inputs.
   - Understand Checked vs. Unchecked exceptions and custom exception classes.
5. **[Generics](./Generics/README.md)**
   - Write type-safe, reusable code.
   - Master wildcard bounds (PECS: Producer Extends, Consumer Super).
6. **[Streams and Lambdas](./StreamsAndLambdas/README.md)**
   - Embrace functional programming in Java.
   - Process collections efficiently using declarative pipelines.

### Phase 3: Advanced Concepts & Architecture
7. **[Multithreading & Concurrency](./Multithreading/README.md)**
   - Understand the perils of shared mutable state.
   - Master synchronization, Locks, Semaphores, and Thread Pools (ExecutorService).
8. **[SOLID Principles](./SolidPrinciples/README.md)**
   - The bedrock of maintainable software design.
   - Learn how to prevent code rot by adhering to SRP, OCP, LSP, ISP, and DIP.
9. **[Design Patterns](./Design%20Patterns/README.md)**
   - Proven solutions to common software design problems.
   - Covers Creational (Singleton, Builder, Factory, Prototype), Structural (Adapter, Facade, Decorator, Flyweight), and more.

---

## 🛠 Engineering Standards Applied

This codebase isn't just a collection of examples; it's a demonstration of production-grade coding practices. Across all modules, you will notice:

- **Strict Encapsulation**: State is locked down (`private`) and mutated only through controlled behaviors.
- **Meaningful Naming**: Variables like `x` and `n` have been replaced with descriptive names. Code reads like English.
- **Comprehensive Javadoc**: Every class and public method is documented, explaining not just *what* it does, but *why* the pattern was chosen.
- **Robust Error Handling**: Exceptions are thrown early with clear, actionable error messages.
- **Test-Driven Verification**: Every module includes plain JUnit 5 test classes to verify behavior programmatically.

## 🚀 How to Run Tests

The codebase uses plain JUnit 5 without complex build tools like Maven or Gradle. We have included a standalone JUnit Console Launcher to make running tests simple.

To run tests for a specific module (e.g., `OOPS-1`), navigate to the root directory and execute:

```bash
javac -cp .:junit-platform-console-standalone.jar OOPS-1/test/**/*.java OOPS-1/src/**/*.java
java -jar junit-platform-console-standalone.jar -cp OOPS-1/src:OOPS-1/test --scan-classpath
```

---

*“Code is read much more often than it is written.”* – Guido van Rossum
