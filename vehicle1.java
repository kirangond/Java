package blocks;

public class vehicle1 {
	//at first block will execute and then constructor
	{
		System.out.println("hey");
	}
	vehicle1()
	{
		super(); //internally compiler treats
		System.out.println("print constructor");
	}
	{
		System.out.println("bye");
	}
	{
		System.out.println("tata bye");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        vehicle1 v=new vehicle1();
       
	}

}
