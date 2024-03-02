package OOPs.Classes;

class Animal5
{
	int age;
	String color;

	Animal5(int age1, String color1)
	{
		age=age1;
		color=color1;
	}

	void eat()
	{
		System.out.println("i am eating");
	}
	void run()
	{
		System.out.println("i am running");
	}

	public static void main(String[] args)
	{
		Animal5 buzo=new Animal5(10, "brown");
		System.out.println("Age : "+buzo.age);
		System.out.println("Color : "+buzo.color);
		buzo.eat();
		buzo.run();

		System.out.println("---------------------");

		Animal5 cat=new Animal5(5, "black");
		System.out.println("Age : "+cat.age);
		System.out.println("Color : "+cat.color);
		cat.eat();
		cat.run();
	}
}