import java.io.*;
import java.util.Scanner;

/**
 * Main Test Class for the Dealership System
 */
public class DealershipDraft {

    public static void main(String[] args) {
        displayProgramSummary();

        // User Story 1: Create a dealership
        Dealership myShop = new Dealership("Isabella's Autos", 5);

        // User Story 6: Read car inventory from a file
        // Note: Make sure "inventory.txt" exists or handles the error
        dealershipSetUp("inventory.txt", myShop);

        // User Story 2: Add a car manually (Testing)
        myShop.addCar(new Car("Toyota", "Prius", 20000.00));
        myShop.addCar(new Car("Ford", "Mustang", 50000.00));

        // User Story 3: Display all cars
        myShop.displayCars();

        // User Story 4: Find most expensive car
        Car expensive = myShop.findMostExpensiveCar();
        if (expensive != null) {
            System.out.println("\n--- Featured Vehicle ---");
            System.out.println("Most Expensive: " + expensive.getMake() + " " + expensive.getModel() 
                                + " ($" + expensive.getPrice() + ")");
        }

        // User Story 5: Write inventory to a file
        myShop.writeCarsToFile("summary.txt");
    }

    /**
     * Reads data from a file and populates the dealership
     */
    public static void dealershipSetUp(String fileName, Dealership newDealership) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Input file not found. Starting with empty inventory.");
            return;
        }

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] data = line.split(","); // Assuming CSV format: Make,Model,Price
                if (data.length == 3) {
                    String make = data[0].trim();
                    String model = data[1].trim();
                    double price = Double.parseDouble(data[2].trim());
                    newDealership.addCar(new Car(make, model, price));
                }
            }
            System.out.println("Inventory loaded successfully from " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing price data in file.");
        }
    }

    public static void displayProgramSummary() {
        System.out.println("******************************************");
        System.out.println("   Dealership Management System v1.0");
        System.out.println("******************************************");
    }
}

/**
 * Car Class
 */
class Car {
    private String make;
    private String model;
    private double price;

    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public double getPrice() { return price; }

    public void displayCarDetails() {
        System.out.printf("Make: %-10s | Model: %-10s | Price: $%,.2f%n", make, model, price);
    }
}

/**
 * Dealership Class
 */
class Dealership {
    private String name;
    private Car[] cars;
    private int currentNumberCars;

    public Dealership(String name, int maxNumCars) {
        this.name = name;
        this.cars = new Car[maxNumCars];
        this.currentNumberCars = 0;
    }

    public String getDealershipName() {
        return name;
    }

    public void addCar(Car newCar) {
        if (currentNumberCars < cars.length) {
            cars[currentNumberCars] = newCar;
            currentNumberCars++;
        } else {
            System.out.println("Inventory Full! Cannot add: " + newCar.getMake());
        }
    }

    public Car findMostExpensiveCar() {
        if (currentNumberCars == 0) return null;
        
        Car top = cars[0];
        for (int i = 1; i < currentNumberCars; i++) {
            if (cars[i].getPrice() > top.getPrice()) {
                top = cars[i];
            }
        }
        return top;
    }

    public void displayCars() {
        System.out.println("\n--- " + name + " Inventory ---");
        for (int i = 0; i < currentNumberCars; i++) {
            cars[i].displayCarDetails();
        }
    }

    public void writeCarsToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Dealership: " + name);
            writer.println("------------------------------");
            for (int i = 0; i < currentNumberCars; i++) {
                Car c = cars[i];
                writer.println(c.getMake() + "," + c.getModel() + "," + c.getPrice());
            }
            System.out.println("\nInventory summary saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}