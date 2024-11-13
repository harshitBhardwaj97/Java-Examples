# Interface in Java

In Java, an interface is a reference type, similar to a class, that can contain only constants, method signatures,
default methods, static methods, and nested types. Interfaces provide a mechanism for defining contracts that can be
implemented by classes to ensure certain methods are available.

This document outlines key characteristics of interfaces in Java.

## Key Characteristics of Interfaces

### 1. **Interfaces Are Implicitly Abstract**

- An interface is inherently **abstract**. This means that all methods declared in an interface are abstract by default,
  except for static, default, or private methods (introduced in Java 9).
- You do not need to declare the `abstract` keyword when defining an interface. It is implied by default.

### 2. **Interface Variables Are Implicitly `public`, `static`, and `final`**

- **Public**: Interface variables are **public** by default, meaning they can be accessed by any class implementing the
  interface or even by other classes.
- **Static**: Interface variables are **static**, meaning they belong to the interface itself, not any instance of a
  class that implements the interface.
- **Final**: Interface variables are **final**, meaning once they are assigned a value, they cannot be changed. They are
  constants.

### 3. **Interface Methods Without a Body Are Implicitly Abstract**

- All methods declared in an interface, except for default and static methods, are implicitly abstract. This means the
  implementing class is responsible for providing the method's implementation.
- You do not need to use the `abstract` keyword to declare a method in an interface as abstract. It is implied.

### 4. **Interface Methods Without the Private Modifier Are Implicitly Public**

- By default, all methods declared in an interface are **public**. They must be implemented as public methods in the
  implementing class.
- **Private** methods can only be defined in interfaces from Java 9 onwards. These methods are meant for internal use
  within the interface and cannot be accessed by implementing classes.

### 5. **Default Methods (Java 8 and Later)**

- Introduced in Java 8, **default methods** allow interfaces to provide method implementations.
- Default methods can have a body and do not need to be implemented by the classes that implement the interface unless
  they choose to override them.
- A class can implement the default method if needed, but it is not mandatory.

### 6. **Static Methods**

- Interfaces can also contain **static methods**. These methods are called on the interface itself and not on the class
  that implements the interface.
- Static methods in interfaces are not inherited by implementing classes. They must be invoked using the interface name.

### 7. **Private Methods (Java 9 and Later)**

- **Private methods** in interfaces are allowed from Java 9 onwards.
- These methods cannot be accessed by implementing classes, but can be used within default methods or other private
  methods of the interface for code reuse.

### 8. **Interfaces Cannot Be Instantiated**

- You cannot create an instance of an interface directly.
- Interfaces are meant to be implemented by classes, which then provide concrete behavior for the interface methods.

### 9. **An Interface Can Extend Other Interfaces**

- Interfaces can extend other interfaces, allowing them to inherit the method signatures from other interfaces. An
  interface can extend multiple interfaces, supporting multiple inheritance.

---

## Summary of Key Points:

- **Implicitly abstract**: Interfaces are abstract by default, and their methods are abstract unless specified
  as `default`, `static`, or `private`.
- **Variables are `public`, `static`, and `final`**: All variables in interfaces are constants, meaning they are shared
  across all implementing classes.
- **Methods are `public`** by default: All methods in interfaces are public, and they must be implemented as public in
  the implementing classes.
- **Default and static methods**: Java 8 introduced default and static methods in interfaces to allow for shared
  behavior and helper methods within the interface itself.
- **Private methods** (Java 9+): Interfaces can now have private methods for internal use, primarily to avoid code
  duplication.

---

## Conclusion

Interfaces in Java provide a robust mechanism for defining abstract contracts that can be implemented by any class.
Understanding how interface methods, variables, and modifiers work is key to leveraging interfaces effectively in Java.

This document covers the primary points, but as Java evolves, especially with new features in later versions (like Java
9+), the role and capabilities of interfaces continue to expand.
