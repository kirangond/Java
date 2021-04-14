package typecasting;

public class CounterStrike {
	 //upcasting and we can only properties & methods of super class & overriden methods
	Weapon pressButton()
	{
		int key=8;
		if(key>=1 && key<=5)
		{
			Gun g=new Gun();
			return g;
		}
		else if(key>=6 && key<=7)
		{
			Knife k=new Knife();
			return k;
		}
		else
		{
			Bomb b=new Bomb();
			return b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterStrike cs=new CounterStrike(); 
		
		
		Weapon w=cs.pressButton();  //internally treats new Bomb()
		Weapon w1=cs.pressButton();
		Weapon w2=cs.pressButton();
		
		System.out.println(w);
		System.out.println(w1);
		System.out.println(w2);
		
        
	}

}
