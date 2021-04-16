package exceptionhandling;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main starts");
		try
		{
			System.out.println(10/0);
			int i=Integer.parseInt("10.200");
			int a[]= {1,2,3};
			System.out.println(a[4]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("this is arithmetic exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("this is Number format exception");
		}
		
		catch(Throwable e)
		{
			System.out.println("this is exception");
		}
		System.out.println("main ends");
		

	}

}

