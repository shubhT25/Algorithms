package OOPs.Super;

class A1
{
	void m1()
	{
		final int a=10;
		System.out.println(a+20);
	}
}
class FinalTest1
{
	public static void main(String[] args)
	{
		A1 ob=new A1();
		ob.m1();
	}
}