/**
 * 
 */

/**
 * 
 */
//for file writing
import java.io.File;
import java.io.IOException;

public class DealershipTest
{

	public static void main(String[] args)
	{
		//main method//
		//create a dealership with a limit of cars you can enter
		Dealership myShop= new Dealership("Isabella's Autos", 3);
		//create a car (hard-coding for test cases)
		myShop.addCar(new Car ("Toyota", "Prius", 20000.00));
		myShop.addCar(new Car ("Ford", "Mustang", 50000.00));
		myShop.addCar(new Car ("BMW", "roadster", 21000.00));

		//display everything in your dealership
			myShop.displayAllCars();
			
		//find most expensive car 
			Car expensive=myShop.findMostExpensive();
			System.out.println("Most expensive car: "+expensive.make+ " " +expensive.model+" "+expensive.price);
		//write to file

	}

}
/**new class: Car**/
class Car{
//initializing (attribute variables)
String make;
String model;
Double price;

/** construct an entry for a car (constructor used to initialize the attributes**/
Car(String make, String model, double price){
this.make=make;
this.model=model;
this.price=price;
}
//getters: they get the value so that other classes can see them 
String getMake() {
	return make;
}

String getModel() {
	return model;
}

double getPrice() {
	return price;
}
//method to display the test car details
void displayCarDetails() {
	System.out.println( "Make: "+ make +", Model: "+model+", Price:"+ price);
}//end method 
}//end car class


/**new class: Dealership**/
class Dealership{
	String name;
	Car[] inventory;
	int currentNumberCars;
	
	Dealership(String name, int maxCapacity){
		this.name=name; //dealership name
		this.inventory= new Car[maxCapacity]; //storing the size of array as length of capacity
		this.currentNumberCars=0;//starting empty when program starts
	}
void addCar(Car newCar) {
	//check if the array is already filled 
	if(currentNumberCars<inventory.length) {
		inventory[currentNumberCars]=newCar;
		currentNumberCars++;
		System.out.println(newCar.getMake()+ " added to "+name);
	}
	else {
		System.out.println("Error: the dealership is full!");
	}
}
void displayAllCars() {
	System.out.println(name +" Inventory");
	for (int i=0; i<currentNumberCars; i++) {
		inventory[i].displayCarDetails();
	}
}
Car findMostExpensive() {
	Car top=inventory[0];
	for(int i=1; i< carCount; i++) {
		if (inventory[i].price>top.price) {
			top=inventory[i];
		}
	}
	return top;
}
}
void writeCarsToFile() {
}

