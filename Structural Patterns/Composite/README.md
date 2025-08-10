# Composite

## Concept
Compose objects into tree structures to represent part-whole hierarchies and allow clients to treat individual objects and compositions uniformly.

## Steps
1. Define a component interface for all objects in the composition.
2. Create leaf classes representing primitive elements.
3. Implement a composite class that stores child components and implements component interface.
4. Client treats both leaves and composites uniformly through the component interface.
