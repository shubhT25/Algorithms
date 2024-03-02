package OOPs.Super;

class A5
{
	void show1()
	{
		System.out.println("i m in class A");
	}
}
class B5 extends A5
{
	void show2()
	{
		super.show1();
		System.out.println("im in class B");
	}
}

class SuperTest2
{
	public static void main(String[] args)
	{
		B5 ob=new B5();
		ob.show2();
	}
}