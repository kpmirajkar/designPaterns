# Observer

## Concept
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Steps
1. Define a subject interface with methods to attach, detach, and notify observers.
2. Define an observer interface declaring an update method.
3. Implement a concrete subject that maintains a list of observers and notifies them of changes.
4. Implement concrete observers that react to updates from the subject.
5. Client registers observers with the subject to receive updates.
