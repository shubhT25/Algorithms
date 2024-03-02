package OOPs.Classes;

class Bir
{
	void fly()
	{
		System.out.println("i am flying");
	}
}
class Ani
{
	void eat()
	{
		System.out.println("i am eating");
	}
}
class Main
{
	public static void main(String[] args)
	{
		Ani buzo=new Ani();
		buzo.eat();

		Bir crow=new Bir();
		crow.fly();
	}
}