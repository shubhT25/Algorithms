package OOPs.Overriding;

class A3
{
	void show(int a)
	{
		System.out.println(a);
	}
}
class B3 extends A3
{
	void show(int a)
	{
		System.out.println(a);
	}
}
class MethodOverriding3
{
	public static void main(String[] args)
	{
		A3 ob3=new B3();
		ob3.show(20);
	}
}