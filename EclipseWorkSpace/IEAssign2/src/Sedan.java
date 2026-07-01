
public class Sedan extends Vehicle{
	
	public Sedan(String make, String model, String color, String id, int year, double price) {
        super(make, model, color, id,  year, price);
    }
	
	public void setPrice(double newPrice) {
		if(newPrice >= 10000) {
			price = 10000;
		}
		else{
			price = newPrice;
		}
    }

}
