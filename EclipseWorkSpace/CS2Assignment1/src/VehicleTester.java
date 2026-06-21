public class VehicleTester {
    public static void main(String[] args) {
        System.out.println("=== STARTING VEHICLE TESTS ===\n");

        // 1. TEST SEDAN (Rule: Price capped at 10,000)
        System.out.println("--- Testing Sedan ---");
        // Test behavior during initialization (Price is 15,000)
        Sedan sedan = new Sedan("Toyota", "Camry", "Blue", "SED123", 2022, 15000.00);
        System.out.println("Expected Price: 10000.00 | Actual: " + sedan.getPrice());
        
        // Test behavior during manual setter update
        sedan.setPrice(12500.00);
        System.out.println("Expected Price after update: 10000.00 | Actual: " + sedan.getPrice());
        System.out.println(sedan.toString() + "\n");


        // 2. TEST SUV (Rule: ID truncated to 15 characters)
        System.out.println("--- Testing SUV ---");
        // This ID is 20 characters long
        String longId = "12345678901234567890"; 
        SUV suv = new SUV("Ford", "Explorer", "Black", longId, 2023, 35000.00);
        System.out.println("Expected ID Length: 15 | Actual Length: " + suv.getId().length());
        System.out.println("Expected ID: 123456789012345 | Actual ID: " + suv.getId());
        
        // Test behavior during manual setter update
        suv.setId("ABCDEFGHIJKLMNOPQRSTUVWXYZ"); // 26 characters
        System.out.println("Expected Updated ID: ABCDEFGHIJKLMNO | Actual ID: " + suv.getId() + "\n");


        // 3. TEST MINIVAN (Rule: "red" turns into "255-000-000")
        System.out.println("--- Testing MiniVan ---");
        // Test behavior during initialization
        MiniVan minivan = new MiniVan("Honda", "Odyssey", "red", "VAN789", 2021, 28000.00);
        System.out.println("Expected Color: 255-000-000 | Actual: " + minivan.getColor());
        
        // Test behavior during manual setter update
        minivan.setColor("blue"); // should stay blue
        System.out.println("Expected Color: blue | Actual: " + minivan.getColor());
        minivan.setColor("red"); // should flip back to RGB
        System.out.println("Expected Color: 255-000-000 | Actual: " + minivan.getColor() + "\n");

        System.out.println("=== TESTS COMPLETE ===");
    }
}