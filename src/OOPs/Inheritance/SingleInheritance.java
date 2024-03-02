package OOPs.Inheritance;

class AAA
{
	void show1()
	{
		System.out.println("i am in class S");
	}
}
class BBB extends AAA
{
	void show2()
	{
		System.out.println("i am in class B");
	}
}
class SingleInheritance
{
	public static void main(String[] args)
	{
		AAA ob1=new AAA();
		ob1.show1();
		//ob1.show2();

		BBB ob2=new BBB();
		ob2.show2();
		ob2.show1();
	}
}