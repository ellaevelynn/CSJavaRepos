public class MiniVan extends Vehicle {

    // Constructor: Converts "red" to color ID 255-000-000
    public MiniVan(String make, String model, String color, String id, int year, double price) {
        super(make, model, "red".equals(color) ? "255-000-000" : color, id, year, price);
    }

    // Method Override: Converts "red" to code format when called later 
    @Override
    public void setColor(String color) {
        if ("red".equals(color)) {
            super.setColor("255-000-000");
        } else {
            super.setColor(color);
        }
    }
}