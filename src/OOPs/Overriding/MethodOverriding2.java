package OOPs.Overriding;

class A2
{
	void show()
	{
		System.out.println("1");
	}
}
class B2 extends A2
{
	void show()
	{
		System.out.println("2");
	}
}
class MethodOverriding2
{
	public static void main(String[] args)
	{
		A2 ob1=new A2();
		ob1.show();

		B2 ob2=new B2();
		ob2.show();

		A2 ob3=new B2();
		ob3.show();
		//ob3.show();			not possible
	}
}