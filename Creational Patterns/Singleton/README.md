# Singleton

## Concept
Ensure a class has only one instance and provide a global point of access to it.

## Steps
1. Make the constructor private to prevent direct instantiation.
2. Create a static method that returns the single instance.
3. Lazily create the instance when first requested.
4. Provide global access to the instance via the static method.
