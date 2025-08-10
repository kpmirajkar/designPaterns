# State

## Concept
Allow an object to alter its behavior when its internal state changes; the object appears to change its class.

## Steps
1. Define a state interface declaring behavior associated with a particular state.
2. Implement concrete state classes for each state of the context.
3. Create a context class that maintains a reference to the current state.
4. Context delegates state-specific behavior to the current state object and can change it to transition between states.
