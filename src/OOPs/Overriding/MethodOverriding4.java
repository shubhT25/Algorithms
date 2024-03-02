package OOPs.Overriding;

class A4
{
	void show(int a)
	{
		System.out.println(a);
	}
}
class B4 extends A4
{
	void show(String a)
	{
		System.out.println(a);
	}
}
class MethodOverriding4
{
	public static void main(String[] args)
	{
		A4 ob3=new B4();
		ob3.show(10);
	}
}