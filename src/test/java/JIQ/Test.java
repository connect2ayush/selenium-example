package JIQ;

import java.util.HashMap;
import java.util.Map;

public class Test {

    // Instance variables
    String color;
    int wheels;
    Map<String, String> config;

    // 1️⃣ Default constructor
    public Test() {
        this("Red", 4); // Call parameterized constructor from default
        System.out.println("Default constructor is called");
    }

    // 2️⃣ Parameterized constructor with one argument
    public Test(String color) {
        this.color = color;
        this.wheels = 4; // default value
        System.out.println("One-parameter constructor is called");
    }

    // 3️⃣ Parameterized constructor with two arguments
    public Test(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
        this.config = new HashMap<>();
        config.put("engine", "petrol");
        config.put("transmission", "manual");
        System.out.println("Two-parameter constructor is called");
    }

    // 4️⃣ Method to display object state
    public void displayInfo() {
        System.out.println("Vehicle color: " + color);
        System.out.println("Wheels: " + wheels);
        System.out.println("Configuration: " + config);
    }

    public static void main(String[] args) {
        // ➤ Creating object using default constructor
        Test t1 = new Test();
        t1.displayInfo();

        System.out.println("-----------------------------");

        // ➤ Creating object using one-parameter constructor
        Test t2 = new Test("Blue");
        t2.displayInfo();

        System.out.println("-----------------------------");

        // ➤ Creating object using two-parameter constructor
        Test t3 = new Test("Black", 2);
        t3.displayInfo();
    }
}
