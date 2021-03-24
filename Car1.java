package methods;

public class Car1 {
	 String name;
	 int price;
	 String color;
	 //return method 
	 int priceOfCar()
	 {
		 return 1000000;
	 }
     
	 String nameOfCar()
	 {
		 return "tesla";
	 }
	 
	 String colorOfCar()
	 {
		 return "black";
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car1 c=new Car1();
       System.out.println(c.priceOfCar());
       System.out.println(c.nameOfCar());
       System.out.println(c.colorOfCar());
	}

}
