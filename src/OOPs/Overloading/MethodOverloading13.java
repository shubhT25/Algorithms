package OOPs.Overloading;

class Test13
{
	Test13()
	{
		System.out.println("1");
	}
	Test13(int a)
	{
		System.out.println("2");
	}
}
class MethodOverloading13
{
	public static void main(String[] args)
	{
		new Test13();
		Test13 t2=new Test13(10);
	}
}