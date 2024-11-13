# Abstract Classes in Java

In Java, an abstract class is a class that cannot be instantiated on its own and is meant to be subclassed by other
classes. Abstract classes are used to define common behavior and shared attributes for a group of related classes, but
they leave some methods unimplemented, allowing subclasses to provide specific implementations.

This document outlines key characteristics and rules about abstract classes in Java.

## Key Characteristics of Abstract Classes

### 1. **Abstract Classes Cannot Be Instantiated**

- An **abstract class** cannot be instantiated directly. You cannot create an object of an abstract class.
- The purpose of an abstract class is to be extended by concrete classes, which provide specific implementations for its
  abstract methods.

### 2. **Abstract Methods Must Be Implemented by Subclasses**

- Abstract classes can contain **abstract methods** (methods without a body). These methods are meant to be overridden
  in concrete subclasses.
- Any class that extends an abstract class must provide implementations for all abstract methods, unless the subclass is
  also abstract.

### 3. **Concrete Methods Can Be Defined in Abstract Classes**

- Abstract classes can have **concrete methods** (methods with a body). These methods provide default behavior that can
  be inherited by subclasses.
- Concrete methods can be used as is or overridden by the subclass, depending on the needs of the subclass.

### 4. **Abstract Classes Can Have Constructors**

- Abstract classes can have constructors, which can be invoked by subclasses when creating an object.
- The constructor of an abstract class is called when an object of a subclass is instantiated, and it is used to
  initialize shared state or perform setup operations.

### 5. **Abstract Classes Can Have Instance Variables**

- Abstract classes can have instance variables (fields) just like any regular class. These variables can be used to
  store state and data that is shared across all subclasses.
- These fields can be **private**, **protected**, or **public**, depending on the desired level of access control.

### 6. **An Abstract Class Can Extend Another Class**

- Just like regular classes, abstract classes can extend other classes, including other abstract classes. In this case,
  the subclass must provide implementations for all abstract methods, unless the subclass is also abstract.

### 7. **Abstract Classes Can Implement Interfaces**

- Abstract classes can implement one or more interfaces. If an abstract class implements an interface, it is not
  required to implement the interface methods, but it can choose to do so. Concrete subclasses of the abstract class are
  required to implement the interface methods.

### 8. **Abstract Classes Can Be Used to Define a Template Method Pattern**

- Abstract classes are commonly used in the **Template Method Pattern**, where an abstract class defines the structure
  of an algorithm, and concrete subclasses implement the specific details of certain steps in the algorithm.
- The template method defines the skeleton of the algorithm and calls methods that can be abstract or concrete.

---

## Summary of Key Points:

- **Cannot be instantiated**: Abstract classes cannot be instantiated directly, but must be subclassed.
- **Abstract methods**: Abstract classes can contain abstract methods, which must be implemented by subclasses, unless
  the subclass is abstract.
- **Concrete methods**: Abstract classes can also contain concrete methods with implementation that can be inherited or
  overridden by subclasses.
- **Constructors**: Abstract classes can have constructors, which are called when a subclass is instantiated.
- **Instance variables**: Abstract classes can contain fields to store state that can be shared across subclasses.
- **Inheritance**: Abstract classes can extend other classes and implement interfaces.
- **Template Method Pattern**: Abstract classes are useful in implementing the Template Method Pattern to define the
  structure of an algorithm.

---

## Conclusion

Abstract classes in Java provide a powerful way to create common behavior for related classes while allowing subclasses
to customize or extend that behavior. Understanding how abstract classes work, including abstract methods, concrete
methods, and the use of constructors, is key to using them effectively.

While interfaces are used to define **contracts** that classes can implement, abstract classes are used to define *
*common functionality** for related classes. The use of abstract classes allows you to write more maintainable and
extensible code by defining shared behavior in one place while allowing flexibility in the details.

This document covers the primary points of abstract classes, but as Java evolves, their role and capabilities continue
to expand.
