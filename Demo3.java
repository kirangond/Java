package exceptionhandling;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("main starts");
     try
     {
    	System.out.println(10/0);
    	int i=Integer.parseInt("hello");
     }
     //when to use multiple catch -> if handler code is specific for  exception
     catch(ArithmeticException e)
     {
    	System.out.println("arithmetic  exception"); 
     }
     
     catch(NumberFormatException e)
     {
    	System.out.println("numberformat exception"); 
     }
     System.out.println("main ends");
	}

}

