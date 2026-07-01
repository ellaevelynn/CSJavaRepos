
public class MiniVan extends Vehicle{
	
	public MiniVan(String make, String model, String color, String id, int year, double price) {
        super(make, model, color, id, year, price);
    }
	
	public void setColor(String newColor) {
		 if (newColor.equalsIgnoreCase("red")) {
	            color = "255-000-000";
	        } else {
	            color = newColor;
	        }
    }

}
