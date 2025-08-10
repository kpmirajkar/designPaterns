# Flyweight

## Concept
Use sharing to support large numbers of fine-grained objects efficiently.

## Steps
1. Identify intrinsic state that can be shared and extrinsic state supplied by clients.
2. Define a flyweight interface that accepts extrinsic state.
3. Implement concrete flyweights storing intrinsic state.
4. Create a flyweight factory that manages and reuses flyweight objects.
5. Clients obtain flyweights from the factory and pass in extrinsic state when using them.
