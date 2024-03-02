package OOPs.Overriding;

class A7
{
	void show(int i)
	{
		System.out.println("1");
	}
}
class B7 extends A7
{
	public void show(int i)
	{
		System.out.println("2");
	}
}
class MethodOverriding7
{
	public static void main(String[] args)
	{
		A7 ob3=new B7();
		ob3.show(20);
	}
}