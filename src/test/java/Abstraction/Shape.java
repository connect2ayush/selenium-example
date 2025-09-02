package Abstraction;

public abstract class Shape {
    // we can have abstract and non methods in abstract class
    // We can not create object of abstract class

    int color;

    abstract void drawing(); // abstract method

    public void fill(){
        System.out.println("Filling");
    }
}
