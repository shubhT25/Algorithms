package OOPs.Overloading;

class Test9
{
	void display(Object a)
	{
		System.out.println("1");
	}
	void display(String a)
	{
		System.out.println("2");
	}
	void display(StringBuilder a)
	{
		System.out.println("3");
	}
}
class MethodOverloading9
{
	public static void main(String[] args)
	{
		Test9 t=new Test9();

		//t.display(null);		

		t.display("deepak");
		t.display(new StringBuilder("amit"));

		Object o=new Object();
		t.display(o);
	}
}