import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * DealershipTest Class
 * This class handles the program flow and file coordination.
 */
public class DealershipTest {

    public static void main(String[] args) {
        displayProgramSummary();// goes to method to display summary
        String fileName = "cars1.txt"; // Ensure this file exists in your project folder
        //calls test files 
        try {
            System.out.println("\nTesting file: " + fileName);
            Dealership dealership = new Dealership("CS Dealership", 6);
            
            // User Story 6: Load data from file
            dealershipSetUp(fileName, dealership);
            
            // User Story 3: Display inventory
            dealership.displayCars();
            
            // User Story 4: Identify expensive vehicle
            System.out.println("\nMost Expensive Car:");
            dealership.displayMostExpensiveCar();
            
            // User Story 5: Write summary to file
            String outputFileName = dealership.getDealershipName() + ".txt";
            dealership.writeCarsToFile(outputFileName);
            
        } catch (FileNotFoundException exception) {
            System.out.println("Error: Unable to find file " + fileName);
        }
        
        System.out.println("\nEnd of program");
    }

    /**
     * Reads car data from a text file.
     * Expected file format: Make Model Price (space separated)
     */
    public static void dealershipSetUp(String fileName, Dealership newDealership) throws FileNotFoundException {
        File inputFile = new File(fileName);
        Scanner fileScanner = new Scanner(inputFile);
        
        while (fileScanner.hasNext()) {
            String make = fileScanner.next();
            String model = fileScanner.next();
            double price = fileScanner.nextDouble();
            
            Car car = new Car(make, model, price);
            newDealership.addCar(car);
        }
        fileScanner.close();
    }

    public static void displayProgramSummary() {
        System.out.println("**************************************");
        System.out.println("Dealership and Car Analysis");
        System.out.println("**************************************");
        System.out.println("Reads car data from a file");
        System.out.println("Displays all cars");
        System.out.println("Finds most expensive car");
        System.out.println();
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

    // Helper method to find the car object
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

    // New method to match your main method call
    public void displayMostExpensiveCar() {
        Car expensive = findMostExpensiveCar();
        if (expensive != null) {
            expensive.displayCarDetails();
        } else {
            System.out.println("No cars in inventory.");
        }
    }

    public void displayCars() {
        System.out.println("--- " + name + " Inventory ---");
        for (int i = 0; i < currentNumberCars; i++) {
            cars[i].displayCarDetails();
        }
    }

    public void writeCarsToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Inventory Summary for: " + name);
            for (int i = 0; i < currentNumberCars; i++) {
                Car c = cars[i];
                writer.println(c.getMake() + " " + c.getModel() + " " + c.getPrice());
            }
            System.out.println("Summary written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

