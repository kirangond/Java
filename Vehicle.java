package blocks;

public class Vehicle {
      int price;
      String color;
      String name;
      //block
      {
    	  price=200000;
    	  color="black";
    	  name="nano";
    	  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();  //after creating object automatically calls block
		System.out.println(v.price+" "+v.color+" "+v.name);

	}

}
