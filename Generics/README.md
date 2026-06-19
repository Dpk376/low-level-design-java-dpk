# Generics

This module demonstrates the use of Java Generics to create reusable, type-safe code.

## Key Concepts Covered
- **Generic Classes (`GenericPair<T, V>`)**: Classes parameterized over types.
- **Type Bounds**: Upper and lower bounded wildcards (PECS principle) demonstrated in `UserUtility`.
- **Generic Methods**: Methods that introduce their own type parameters.

## Structure
- `GenericPair.java`: A basic generic pair class holding two types.
- `bounding/`: Contains examples of inheritance and generics, showing how covariance and contravariance work in Java collections using the `? extends T` (upper bound) and `? super T` (lower bound) wildcards.
- `InventoryManagementSystem/`: Uses generics to create a type-safe `Inventory<T extends Item>` class.

## Testing
JUnit tests are provided in the `test/` directory to verify the behavior of the classes. You can run them using the JUnit Platform Console.
