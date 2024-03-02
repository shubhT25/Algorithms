package OOPs.Super;

class A2
{
	final void m1()
	{
		System.out.println("i am in class A");
	}
}
class B2 extends A2
{
	//error - final method cannot be overridden
//	void m1()
//	{
//		System.out.println("i am in class B");
//	}
}
class FinalTest2
{
	public static void main(String[] args)
	{
		A2 ob=new B2();
		ob.m1();
	}
}