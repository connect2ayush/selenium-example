package javaPracticeOops;

public class TestCar {
    public static void main(String[] args) {
        //Static polymorphism
        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        bmw.refuel();

        System.out.println("***********");
        Car c=new Car();
        c.start();
        c.stop();
        c.refuel();

        System.out.println("***********");

        Car c1= new BMW(); // child clas obj can be refered by parent class ref variable---dynamic polymorphism
        c1.start();
        c1.stop(); // do not have stop method in BMW so will call start method from car class
        c1.refuel();
    }
}
