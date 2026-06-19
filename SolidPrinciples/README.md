# Solid Principles - Bird Examples

This module demonstrates the evolution of a codebase to adhere to SOLID principles.

## BirdV0 (SRP and OCP Violations)
- **SRP Violation:** The `Bird` class has multiple responsibilities. Its `fly()` method contains the flying logic for all different types of birds using `if-else` blocks.
- **OCP Violation:** Every time a new bird is introduced, the `Bird` class must be modified, breaking the Open-Closed Principle.

## BirdV1 (Abstract Method & LSP Violation)
- **Improvement:** `fly()` is made abstract in the `Bird` class. Subclasses (like `Sparrow` and `Crow`) implement their own flying logic, fixing SRP and OCP.
- **LSP Violation:** Introducing a non-flying bird (e.g., `Penguin`) forces it to implement the `fly()` method. It must either do nothing or throw an exception, breaking the Liskov Substitution Principle (LSP).

## BirdV2 (ISP and DIP)
- **ISP:** The flying behavior is extracted into a `Flyable` interface. Non-flying birds no longer implement `Flyable`.
- **DIP:** To avoid code duplication in flying birds, the actual flying mechanism is extracted into a `Flyer` interface (`LowFlyer`, `HighFlyer`). The specific `Flyer` is then injected into the bird (like `Sparrow` or `Pidgeot`) via its constructor, adhering to the Dependency Inversion Principle.
