package polymorphism;

public class Engineer {
     
	void work()
	{
		System.out.println("engineer works");
	}
	public static void main(String[] args) {
		Engineer e=new MechanicalEngineer(); //for which class object is created that class overriden method executes
		
		e.work();
	}
 }





