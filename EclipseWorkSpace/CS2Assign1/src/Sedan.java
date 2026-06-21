public class Sedan extends Vehicle {

    // Constructor: applies the $10,000 cap 
    public Sedan(String make, String model, String color, String id, int year, double price) {
        super(make, model, color, id, year, price >= 10000 ? 10000 : price);
    }

    // Method Override: applies the $10,000 cap when setPrice is called later
    @Override
    public void setPrice(double price) {
        if (price >= 10000) {
            super.setPrice(10000);
        } else {
            super.setPrice(price);
        }
    }
}