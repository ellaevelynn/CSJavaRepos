
public class Isabella_Eaton_Assignment_02 {

    public static void main(String[] args) {

        // Create the vehicle list
    	LList<Vehicle> vehicleList = new LList<>();

        // 3.1 Create vehicles
        MiniVan van1= new MiniVan("Toyota","Sienna","Red","VAN001",2020,3200);
        MiniVan van2= new MiniVan ("Honda","Silver","Red","VAN002",2021,30000);
        MiniVan van3= new MiniVan("Chrysler","Gray","Red","VAN003",2022,35000);
        Sedan sedan1= new Sedan ("Honda","Accord","Black","SED001",2021,27000);
        Sedan sedan2= new Sedan ("Toyota","Camry","White","SED002",2022,25000);
        SUV suv1= new SUV ("Toyota","Highlander","Blue","SUV001",2022,31000);
    	
        // 3.2 Add vehicles to list
        vehicleList.add(van1);
        vehicleList.add(van2);
        vehicleList.add(van3);
        vehicleList.add(sedan1);
        vehicleList.add(sedan2);
        vehicleList.add(suv1);
    	
    	
    	// Print list
        System.out.println("Vehicle List:");
        for(int i = 1; i <= vehicleList.getLength(); i++) {
            System.out.println(vehicleList.getEntry(i));
        }

        System.out.println();

        // 3.3 Count vehicle types
        int miniVanCount = vehicleList.occurrences(MiniVan.class);
        int sedanCount = vehicleList.occurrences(Sedan.class);
        int suvCount = vehicleList.occurrences(SUV.class);
        System.out.println("MiniVan count: " + miniVanCount);
        System.out.println("Sedan count: " + sedanCount);
        System.out.println("SUV count: " + suvCount);
        
    }
}
