package initializingvalues;

public class Student {
	//properties & direct initialization(assigning value to container)
	int id=1;
	String name="kirangond";
	int salary=50000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();  //object creation using new keyword
		System.out.println(s1.id+" "+s1.name+" "+s1.salary);
        
	}

}
