


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


pattern : Strategy
--------------------------------------------------------

### Intent

Define a family of algorithms, encapsulate each one,
and make them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

### How to implement

Define a Strategy interface that declares a method common to all supported algorithms.
Implement concrete strategies as classes that implement this interface.

### advantages

1. It allows you to replace the algorithm of an object at runtime.
2. It isolates the implementation details of an algorithm from the code that uses it.


pattern : chain of responsibility
--------------------------------------------------------

### Intent

Avoid coupling the sender of a request to its receiver 
by giving more than one object a chance to handle the request.


### How to implement

Create a chain of handler objects for a request.
Pass the request
along the chain until an object handles it.

### advantages

1. It reduces the coupling between the sender and the receiver of a request.
2. It allows multiple objects to handle a request without the sender needing to know which object will handle it.
3. It allows you to add or remove responsibilities dynamically.


pattern : Iterator
--------------------------------------------------------

### Intent

Provide a way to access the elements of an aggregate object sequentially
without exposing its underlying representation.


### How to implement

Define an Iterator interface that declares a method for accessing the elements of an aggregate object.

### advantages

1. It allows you to access the elements of an aggregate object sequentially without exposing its underlying representation.
2. It allows you to provide multiple iterators for the same aggregate object.



pattern : Decorator
--------------------------------------------------------

### Intent

Attach additional responsibilities to an object dynamically.


### How to implement

Create a Decorator class that implements the same interface as the component it decorates.


### advantages

1. It allows you to add responsibilities to an object without subclassing it.
2. It allows you to add responsibilities to an object at runtime.


pattern : Flyweight
--------------------------------------------------------

### Intent

Use sharing to support large numbers of fine-grained objects efficiently.


### How to implement

Define a Flyweight interface that declares a method for sharing the state of a flyweight object.


### advantages

1. It reduces the memory footprint of an application by sharing the state of flyweight objects.


pattern : Proxy
--------------------------------------------------------


### Intent

Provide a surrogate or placeholder for another object to control access to it.


### How to implement

Create a Proxy class that implements the same interface as the RealSubject class.


### advantages

1. It allows you to control access to an object.
2. It allows you to defer the creation of an object until it is needed.
3. It allows you to add additional functionality to an object without changing its interface.
4. It avoids code tangling and coupling.


pattern : Adapter
--------------------------------------------------------

### Intent

Convert the interface of a class into another interface clients expect.


### How to implement

Create an Adapter class that implements the interface expected by the client.


### advantages

1. It allows you to use classes that are incompatible with each other.
2. It allows you to reuse existing classes that don't have the interface you need.


pattern : Builder
--------------------------------------------------------

### Intent

Separate the construction of a complex object from its representation.


### How to implement

Define a Builder interface that declares a method for constructing each part of the complex object.


### advantages

1. It allows you to construct complex objects step by step.
2. It allows you to reuse the same construction code to build different representations of a complex object.


pattern : Factory Method
--------------------------------------------------------

### Intent

Define an interface for creating an object, but let subclasses decide which class to instantiate.


### How to implement

Define a Factory Method in a base class that returns an instance of a concrete class.


### advantages

1. It allows you to create objects without specifying the exact class of object that will be created.


pattern : Singleton
--------------------------------------------------------

### Intent

Ensure a class has only one instance and provide a global point of access to it.


### How to implement

Define a static method in the class that returns the same instance of the class every time it is called.


### advantages

1. It allows you to control the number of instances of a class that can be created.
2. It allows you to provide a global point of access to the instance of a class.


