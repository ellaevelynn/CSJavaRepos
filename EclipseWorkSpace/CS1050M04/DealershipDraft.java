
//work on car class first


public class DealershipDraft
{
/**main method**/
public static void main(String[] args) {
	//create a car 
	Car car1= new Car ("Toyota", "Prius", 20000.00);
}//end main
}//end class

class Car{
//initializing
String make;
String model;
Double price;

//getters and setters 
/** construct an entry for a car**/
Car(String make, String model, double price){
this.make=make;
	
	String getMake() {
	make=new make;
}

String getModel() {
	model= new model;
}

double getPrice() {
	price= new price;
}
void displayCarDetails() {
	//printing something?
}
}//end get/set

}//end car class
