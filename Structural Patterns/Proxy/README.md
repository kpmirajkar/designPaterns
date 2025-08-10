# Proxy

## Concept
Provide a surrogate or placeholder for another object to control access to it.

## Steps
1. Define a subject interface that both real subject and proxy implement.
2. Implement the real subject with the actual functionality.
3. Create a proxy class that holds a reference to the real subject and controls access to it.
4. Client interacts with the subject interface; the proxy forwards requests to the real subject as appropriate.
