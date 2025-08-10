# Chain of Responsibility

## Concept
Avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request.

## Steps
1. Define a handler interface with a method to process requests and a reference to the next handler.
2. Implement concrete handlers that either handle the request or delegate to the next handler.
3. Link handlers to form a chain.
4. Client sends the request into the chain without knowing which handler will process it.
