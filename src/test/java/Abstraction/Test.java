package Abstraction;

public class Test extends Shape {

    @Override
    void drawing() {
        System.out.println("drawing");
    }

    public static void main(String[] args) {

        Shape s = new Test();
        s.drawing(); // calling abstract method
        s.fill();   // calling non abstract method

    }
}
