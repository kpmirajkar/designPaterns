# Facade

## Concept
Provide a unified interface to a set of interfaces in a subsystem, making the subsystem easier to use.

## Steps
1. Identify the subsystem classes that clients interact with.
2. Design a facade class that exposes simplified methods.
3. Implement facade methods to delegate to subsystem classes.
4. Clients use the facade instead of interacting with subsystem classes directly.
