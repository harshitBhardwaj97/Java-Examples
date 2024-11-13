package interface_abstract_class;

public class InterfaceMain {

    public static void main(String[] args) {

        // Accessing the static field 'x' from the interface MyInterface
        System.out.println(MyInterface.x); // This will output 10

        // Calling the static method from MyInterface
        MyInterface.staticMethod(); // This will output "This is a static method."

        /*
        The following line would result in a compile-time error, because
        'x' is a constant (public static final) and cannot be reassigned.

        MyInterface.x = 20; // Error: Cannot assign a value to final variable 'x'
        */

        // Implementing the 'foo()' method of MyInterface using a lambda expression
        MyInterface mi = () -> System.out.println("Implementing foo using lambda");

        mi.foo(); // This will output: "Implementing foo using lambda"
        
        mi.bar(); // This will output: "This is a default method."
    }
}
