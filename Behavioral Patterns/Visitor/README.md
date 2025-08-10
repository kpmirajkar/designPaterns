# Visitor

## Concept
Represent an operation to be performed on elements of an object structure without changing the classes on which it operates.

## Steps
1. Define a visitor interface with visit methods for each element type.
2. Define an element interface declaring an accept method that takes a visitor.
3. Implement concrete visitor classes that perform specific operations for each element type.
4. Implement concrete elements that call the appropriate visit method on the visitor within accept.
5. Client traverses the object structure and passes visitors to elements via accept.
