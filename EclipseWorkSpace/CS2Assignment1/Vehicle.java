

public class Vehicle implements VehicleInterface {

    protected String make;
    protected String model;
    protected String color;
    protected String id;
    protected int year;
    protected double price;

    public Vehicle(String make, String model, String color, String id, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.id = id;
        this.year = year;
        this.price = price;
    }

    // ===== Getters =====
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // ===== Setter =====
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return year + " " + make + " " + model + " - $" +
               String.format("%.2f", price);
    }

    public String toFileString() {
        return make + "," + model + "," + year + "," + price;
    }
}
