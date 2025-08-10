# Template Method

## Concept
Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.

## Steps
1. Create an abstract class that defines the template method outlining the algorithm steps.
2. Implement base operations in the abstract class and declare abstract methods for customizable steps.
3. Subclass the abstract class and override the abstract methods to provide specific behavior.
4. Client calls the template method to execute the algorithm with subclass-defined steps.
