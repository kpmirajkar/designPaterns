# Builder

## Concept
Separate the construction of a complex object from its representation so that the same construction process can create different representations.

## Steps
1. Define a builder interface outlining construction steps.
2. Implement concrete builders for specific representations.
3. Create a director that uses a builder to construct the object step by step.
4. Client configures the director with a builder and retrieves the result.
