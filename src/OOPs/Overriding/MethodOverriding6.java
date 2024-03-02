package OOPs.Overriding;

class Parent2
{
}
class Child2 extends Parent2
{
}
class Child3 extends Parent2
{
}
class A6
{
	void check()
	{
		System.out.println("A6");
	}
	Child2 show()
	{
		System.out.println("1");
		return new Child2();
	}
}
class B6 extends A6
{
	Child2 show()
	{
		System.out.println("2");
		return new Child2();
	}
}
class MethodOverriding6
{
	public static void main(String[] args)
	{
		A6 ob3=new B6();
		ob3.check();
		B6 ob2 = (B6) ob3;
		ob2.check();
		Child2 c2 = ob3.show();
	}
}