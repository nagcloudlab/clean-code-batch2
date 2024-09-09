


pattern : Observer / Listener / publish-subscribe
--------------------------------------------------------

### Intent

Define a one-to-many dependency between objects 
so that when one object changes state, 
all its dependents are notified and updated automatically.

### How to implement

Define a Subject class that maintains a list of observers. 
The Subject class provides an interface to attach and detach observers.


### advantages
1. It supports the principle of loose coupling between objects that interact with each other.
2. It allows sending data to other objects effectively without any change in the Subject or Observer classes.
3. It allows an object to broadcast data to multiple other objects.
