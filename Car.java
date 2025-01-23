public class Car {
    private String model;
    private String color;
    private int year;

    // Default constructor
    public Car() {
        model = "Unknown";
        color = "White";
        year = 2000;
        System.out.println("Default car created.");
    }

    // Constructor with model and color
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        year = 2022;  // Default year
        System.out.println("Car created with model and color.");
    }

    // Constructor with all attributes
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
        System.out.println("Car created with all details.");
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    // Main method to test constructor overloading
    public static void main(String[] args) {
        // Call different constructors
        Car car1 = new Car();
        car1.displayDetails();
        
        System.out.println();

        Car car2 = new Car("Toyota", "Red");
        car2.displayDetails();
        
        System.out.println();

        Car car3 = new Car("BMW", "Blue", 2024);
        car3.displayDetails();
    }
}
