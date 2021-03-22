package constructor;

public class Student1 {
     int id;
     String name;
     String branch;
     Student1() //user defined constructor
     {
    	 id=1;
    	 name="kirangond";
    	 branch="cse";
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Student1 s=new Student1();
     System.out.println(s.id+" "+s.name+" "+s.branch);
     
	}

}
