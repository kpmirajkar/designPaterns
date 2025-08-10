# Decorator

## Concept
Attach additional responsibilities to an object dynamically; decorators provide a flexible alternative to subclassing for extending functionality.

## Steps
1. Define a component interface.
2. Create a concrete component class.
3. Implement a base decorator that implements the component interface and holds a reference to a component.
4. Create concrete decorators that add behavior before or after delegating to the wrapped component.
5. Client wraps components with decorators to extend functionality at runtime.
