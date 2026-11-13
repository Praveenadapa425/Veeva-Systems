package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        square.area();
    }
}
