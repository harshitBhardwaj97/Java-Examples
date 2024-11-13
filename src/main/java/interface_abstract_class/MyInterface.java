package interface_abstract_class;

public interface MyInterface {

    // Implicitly, variables in interface are public static and final
    int x = 10;

    // Using protected or private modifier results in compile time error
    // private int y = 20;

    // Static method (available since Java 8)
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Implicitly, methods in interface are public and abstract
    void foo();
    
    // Default method (available since Java 8)
    default void bar() {
        System.out.println("This is a default method.");
    }
}
