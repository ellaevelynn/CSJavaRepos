public class TestSimpleCircle {
  /** Main method */
  public static void main(String[] args) {
    // Create a circle with radius 1
    SimpleCircle circle1 = new SimpleCircle();
    System.out.println("The area of the circle of radius "
      + circle1.radius + " is " + circle1.getArea());

    // Create a circle with radius 25
    SimpleCircle circle2 = new SimpleCircle(25);
    System.out.println("The area of the circle of radius "
      + circle2.radius + " is " + circle2.getArea());

    // Create a circle with radius 125
    SimpleCircle circle3 = new SimpleCircle(125);
    System.out.println("The area of the circle of radius "
      + circle3.radius + " is " + circle3.getArea());

    // Modify circle radius
    circle2.radius = 100; // or circle2.setRadius(100)
    System.out.println("The area of the circle of radius "
      + circle2.radius + " is " + circle2.getArea());
  }
}

// Define the circle class with two constructors
class SimpleCircle {
  double radius;

  /** Construct a circle with radius 1 */
  SimpleCircle() {
    radius = 1;
  }

  /** Construct a circle with a specified radius */
  SimpleCircle(double newRadius) {
    radius = newRadius;
  }

  /** Return the area of this circle */
  double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return the perimeter of this circle */
  double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /** Set a new radius for this circle */
  void setRadius(double newRadius) {
    radius = newRadius;
    
  //creating 3 rectangles 
    SimpleRectangle rect1 = new SimpleRectangle(); // Default 1x1
    SimpleRectangle rect2 = new SimpleRectangle(5, 10);
    SimpleRectangle rect3 = new SimpleRectangle(2.5, 4);

    System.out.println("Rect1 Area: " + rect1.getArea());
    System.out.println("Rect2 Area: " + rect2.getArea());
    System.out.println("Rect3 Perimeter: " + rect3.getPerimeter());
  }
}
class SimpleRectangle {
	  double length;
	  double width;

	  /** Default constructor */
	  SimpleRectangle() {
	    this.length = 1;
	    this.width = 1;
	  }

	  /** Constructor with specified dimensions */
	  SimpleRectangle(double length, double width) {
	    this.length = length;
	    this.width = width;
	  }

	  double getArea() {
	    return length * width;
	  }
	  double getPerimeter() {
		    return 2 * (length + width);
		  }

		  // Getters and Setters
		  double getLength() { return length; }
		  void setLength(double length) { this.length = length; }

		  double getWidth() { return width; }
		  void setWidth(double width) { this.width = width; }
		}
