package OOPs.Overloading;

class Test8
{
	void display(Object a)
	{
		System.out.println("1");
	}
	void display(String a)
	{
		System.out.println("2");
	}
}
class MethodOverloading8
{
	public static void main(String[] args)
	{
		Test8 t=new Test8();
		t.display(null);
	}
}