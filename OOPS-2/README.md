# Object-Oriented Programming (OOP) - Part 2

Welcome to the **OOPS-2** module! Here, we dive deeper into Object-Oriented Programming by exploring advanced concepts like **Inheritance**, **Polymorphism**, and **Deep Copying**.

## Inheritance (The "IS-A" Relationship)

Inheritance allows us to create new classes based on existing ones. It promotes code reuse and logical hierarchy.

**Analogy**: Think of a `Vehicle`. It has wheels and an engine. A `Car` **is a** `Vehicle`, and a `Motorcycle` **is a** `Vehicle`. They both inherit the properties of a Vehicle but can also have their own specific features (like a Car having a trunk).

In our code:
- `User` is the base class (parent).
- `Student` and `Instructor` inherit from `User`.
- Notice how `Student` doesn't need to rewrite the `login()` method; it gets it for free from `User`!

## Polymorphism (Many Forms)

Polymorphism allows objects of different types to be treated as instances of the same class through a common interface.

1. **Compile-time Polymorphism (Method Overloading)**:
   - Seen in `polymorphism.Calculator`.
   - We have multiple `add()` methods with different parameters (e.g., adding two `double`s vs three `int`s). The compiler knows which one to call based on the arguments you provide.

2. **Run-time Polymorphism (Upcasting)**:
   - Seen in `inheritance.Client`.
   - `User u = new Student(...)`. We refer to a `Student` using a `User` variable. This is upcasting. The method `doSomethingForUser(User u)` can accept any subclass of `User`, making our code highly flexible.

## Shallow Copy vs Deep Copy

When creating a new object from an existing one, how we handle nested objects (like an `Exam` inside a `Student`) matters.

- **Shallow Copy**: Both the original and the new object point to the same nested object in memory. Changing the nested object in one affects the other.
- **Deep Copy**: We create a brand-new copy of the nested object as well.

In `oops2.Student`, the copy constructor creates a `new Exam(...)`, ensuring that each student has their own distinct Exam object. Modifying one student's exam won't unintentionally modify another's.

## Running Tests

To verify the logic, we have provided JUnit 5 tests. You can run them using the console standalone jar:
```bash
java -jar ../junit-platform-console-standalone.jar -cp src:test --scan-classpath
```
