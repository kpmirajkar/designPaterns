# Mediator

## Concept
Define an object that encapsulates how a set of objects interact, promoting loose coupling by preventing objects from referring to each other explicitly.

## Steps
1. Define a mediator interface declaring communication operations.
2. Implement a concrete mediator that coordinates colleague objects.
3. Define colleague classes that maintain a reference to the mediator.
4. Colleagues communicate through the mediator instead of directly with each other.
