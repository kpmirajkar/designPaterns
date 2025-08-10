# Strategy

## Concept
Define a family of algorithms, encapsulate each one, and make them interchangeable so that the algorithm can vary independently from clients that use it.

## Steps
1. Define a strategy interface representing the algorithm.
2. Implement concrete strategy classes for different algorithms.
3. Create a context class that maintains a reference to a strategy.
4. Client configures the context with a concrete strategy, which the context uses to perform the algorithm.
