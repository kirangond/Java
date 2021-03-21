package initializingvalues;

public class Employee {
	//properties
         int eid;
         String ename ;
         int esalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(); //object creation
		//assigning value through object reference
		e1.eid=4;
		e1.ename="kiran";
		e1.esalary=50000;
		
		Employee e2=new Employee();
		e2.eid=5;
		e2.ename="pavan";
		e2.esalary=60000;
		
		System.out.println(e1.eid+" "+e1.ename+" "+e1.esalary);
		
		System.out.println(e2.eid+" "+e2.ename+" "+e2.esalary);
		
		
      
	}

}
