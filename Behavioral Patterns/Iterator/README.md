# Iterator

## Concept
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Steps
1. Define an iterator interface with methods to traverse elements.
2. Implement concrete iterator classes for specific aggregate structures.
3. Define an aggregate interface that creates an iterator.
4. Implement concrete aggregates that return an appropriate iterator.
5. Client uses the iterator to access elements without knowing the underlying structure.
