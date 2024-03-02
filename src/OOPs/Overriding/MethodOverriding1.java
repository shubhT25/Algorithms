package OOPs.Overriding;

class A1
{
	void show1()
	{
		System.out.println("1");
	}
}
class B1 extends A1
{
	void show2()
	{
		System.out.println("2");
	}
}
class MethodOverriding1
{
	public static void main(String[] args)
	{
		A1 ob1=new A1();
		ob1.show1();

		B1 ob2=new B1();
		ob2.show2();

		A1 ob3=new B1();
		ob3.show1();
		//ob3.show2();			not possible
	}
}