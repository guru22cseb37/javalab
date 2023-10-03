package javaapplication6;
class Superclass {
    protected int protectedProperty = 42;
    int defaultProperty = 100;
}
class Subclass extends Superclass {
    void accessProperties() {
        int value = protectedProperty;
        System.out.println("Protected Property: " + value);
    }
}
public class Main {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.accessProperties();
    }
}
