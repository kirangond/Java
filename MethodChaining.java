package methods;

public class MethodChaining {
	void study()
	{
		System.out.println("study java");
		 write(); //one method calling another method
	}
	
	void write()
	{
		System.out.println("practice java programs");
		execute();
	}
	
	void execute()
	{
		System.out.println("execute java programs in IDE");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChaining m1=new MethodChaining();
		m1.study();

	}

}
