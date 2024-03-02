package OOPs.Super;

class A6
{
	void show()
	{
		System.out.println("i m in class A");
	}
}
class B6 extends A6
{
	void show()
	{
		System.out.println("im in class B");
	}
	void m1()
	{
		System.out.println("1");
		super.show();
		System.out.println("2");
	}
}

class SuperTest3
{
	public static void main(String[] args)
	{
		B6 ob=new B6();
		ob.m1();
	}
}