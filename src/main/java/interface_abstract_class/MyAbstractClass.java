package interface_abstract_class;

public abstract class MyAbstractClass {

    // Abstract method: subclasses must provide an implementation
    public abstract void abstractMethod();

    // Concrete method: can be used directly by subclasses
    public void concreteMethod() {
        System.out.println("This is a concrete method in MyAbstractClass.");
    }
}
