
public class SUV extends Vehicle{
	
	public SUV(String make, String model, String color, String id, int year, double price) {
        super(make, model, color, id, year, price);
    }
	
	public void setId(String newId) {
        if(newId.length() >= 15){
        	id = newId.substring(0, 14);
        	
        }
        else {
        	id = newId;
        }
    }

}
