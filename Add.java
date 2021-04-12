package polymorphism;
//compile time polymorphism achieved through method overloading
public class Add {
      void add()
      {
    	  System.out.println("this is add method");
      }
      void add(int a,int b)
      {
    	  System.out.println(a+b);
      }
      void add(int a,int b,int c)
      {
    	  System.out.println(a+b+c);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
		a.add();    //based on method binding & number of parameter passed
		a.add(10,20);
		a.add(10,20,30);

	}

}
