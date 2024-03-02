package OOPs.Super;

class A7
{
	A7()
	{
		System.out.println("i am A class constructor");
	}
}
class B7 extends A7
{
	B7()
	{
		System.out.println("i am in B class constructor");
	}
}

class SuperTest4
{
	public static void main(String[] args)
	{
		B7 ob=new B7();
	}
}