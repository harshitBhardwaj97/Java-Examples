package interface_abstract_class;

public class AbstractMain extends MyAbstractClass {

    public static void main(String[] args) {
        AbstractMain abstractMain = new AbstractMain();
        abstractMain.abstractMethod(); // This will output "Implementing abstractMethod in AbstractMain class."

        abstractMain.concreteMethod(); // This will output "This is a concrete method in MyAbstractClass."
    }

    @Override
    public void abstractMethod() {
        System.out.println("Implementing abstractMethod in AbstractMain class.");
    }
}
