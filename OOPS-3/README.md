# OOPS-3: Advanced Object-Oriented Programming Concepts

Welcome to the **OOPS-3** module! This section breaks down important object-oriented programming (OOP) principles in Java. It is designed to be easily understood, even if you are newer to these concepts.

## What's Inside?

We cover three major pillars here:

### 1. Abstraction (`abstractKeyword` & `abstraction`)
**What is it?** Abstraction is about hiding the complex background details and showing only the essential features to the user. Think of it like driving a car: you know how to use the steering wheel and pedals, but you don't need to know exactly how the engine combusts fuel to make the car move.
- We use **abstract classes** and **interfaces** to define *what* something should do, without always saying *how* it should do it. For example, an `Animal` might have an `eat()` method, but the specific way a `Dog` or `Cat` eats is defined by them.

### 2. Polymorphism (`polymorphism`)
**What is it?** "Poly" means many, and "morph" means form. Polymorphism allows objects of different classes to be treated as objects of a common superclass. 
- The most common way we see this is through **method overriding**. If you have a `User` class with a `login()` method, a `Student` and an `Instructor` can both provide their own specific version of how they log in. Even though you call `login()` on what looks like a generic user, Java is smart enough to run the specific code for a Student or Instructor.

### 3. Static Keyword (`staticKeyword`)
**What is it?** Usually, when you create variables in a class, each new object gets its own separate copy of those variables. However, when you mark something as `static`, it means the variable or method belongs to the **Class itself**, not to any specific object.
- For example, if we want to keep track of the *total number* of `Car` objects created, we make a `static int count`. Every car shares this exact same counter.

## How to Run the Tests
This project includes automated tests using JUnit 5. You can compile and run them from the root directory using the standalone JUnit Console Launcher:

```bash
# Compile the main and test code
javac -d out -sourcepath src src/**/*.java
javac -d out -cp out:junit-platform-console-standalone.jar -sourcepath test test/**/*.java

# Run the tests
java -jar junit-platform-console-standalone.jar -cp out --scan-class-path
```
