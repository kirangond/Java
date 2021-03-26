package inheritance;

//with using inheritance
public class Apple extends Fruits{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Fruits f=new Fruits();
         f.cutFruits();
         f.washFruits();
         f.price=2000;
         f.name="Nothing";
         System.out.println( f.price+" "+f.name);
	}

}

//without using inheritance

/*public class Apple
{
	public static void main(String[] args) {
		Fruits f=new Fruits();
        f.cutFruits();
        f.washFruits();
        f.price=2000;
        f.name="Nothing";
        System.out.println( f.price+" "+f.name);
	}
}
*/
