public class SUV extends Vehicle {

    // Constructor: truncates/shortens long IDs 
    public SUV(String make, String model, String color, String id, int year, double price) {
        super(make, model, color, (id != null && id.length() > 15) ? id.substring(0, 15) : id, year, price);
    }

    // Method Override: truncates/shortens long IDs when setId is called later
    @Override
    public void setId(String id) {
        if (id != null && id.length() > 15) {
            super.setId(id.substring(0, 15));
        } else {
            super.setId(id);
        }
    }
}