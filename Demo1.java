package exceptionhandling;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("print-1 statement before exception");
         System.out.println("print-2 statement before exception");
         System.out.println("print-3 statement before exception");
         try
         {
         System.out.println(10/0);  //arithmetic exception
         System.out.println("print statement inside try block"); //after exception next statement will not execute
         }
          
         catch(ArithmeticException e)
         {
        	 System.out.println("arithmentic exception");
         }
         System.out.println("print-4 statement after exception");
         System.out.println("print-5 statement after exception");
         System.out.println("print-6 statement after exception");
         
	}

}
