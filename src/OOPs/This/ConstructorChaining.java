package OOPs.This;

class Test1
{
	Test1()
	{
		this(10);
		System.out.println("default constructor");
	}
	Test1(int a)
	{
		this("deepak");
		System.out.println(a);
	}
	Test1(String a)
	{
		System.out.println(a);
	}
}
class ConstructorChaining
{
	public static void main(String[] args)
	{
		Test1 ob1=new Test1();
		
	}
}