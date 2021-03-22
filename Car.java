package constructor;

public class Car {
  //properties
	int price;
	String color;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();  // creating object of class & default constructor
 		
		System.out.println(c.price); //print default values
		System.out.println(c.color);
		System.out.println(c.name);

	}

}
