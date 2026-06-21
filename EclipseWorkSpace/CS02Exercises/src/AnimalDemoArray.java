
public class AnimalDemoArray
{
	Animal[] animals = {
		    new Dog("Buddy"),
		    new Cat("Luna"),
		    new Bird("Rio");
}
	for (int i = 0; i < animals.length; i++) {
	    animals[i].speak();
	}
}
