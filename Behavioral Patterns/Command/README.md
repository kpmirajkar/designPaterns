# Command

## Concept
Encapsulate a request as an object, allowing you to parameterize clients with different requests, queue or log requests, and support undoable operations.

## Steps
1. Define a command interface declaring an execute method.
2. Implement concrete commands that bind a receiver with an action.
3. Create an invoker that holds a command and calls its execute method.
4. Client instantiates concrete commands and provides them to the invoker.
