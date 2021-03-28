package constructor;

public class Employee1 {
 //properties of employee or state containers
	int eid;
	int esalary;
	String ename;
	
	
	  Employee1(int id,int salary,String name)  //parameter container
	
	{
		eid=id;
		esalary=salary;
		ename=name;
	}
	
	/*
	Employee1(int eid,int esalary,String ename) 
	{
		this.eid=eid;      //current invoking object reference
		this.esalary=esalary;
		this.ename=ename;
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new Employee1(1,50000,"kirangond");  //passing arguments while creating object
		Employee1 e2=new Employee1(2,60000,"charanraj");
		System.out.println(e1.eid+" "+e1.esalary+" "+e1.ename);
		System.out.println(e2.eid+" "+e2.esalary+" "+e2.ename);
		
		

	}

}
