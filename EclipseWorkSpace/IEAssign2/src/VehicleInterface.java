
public interface VehicleInterface {

    String getMake();
    String getModel();
    String getColor();
    String getId();
    int getYear();
    double getPrice();
    

    void setPrice(double price);
    void setId(String id);

    /**
     * Returns a formatted string for menu display
     * (NO printing here)
     */
    String toString();

    /**
     * Returns a formatted string for writing to a file
     */
    String toFileString();
}
