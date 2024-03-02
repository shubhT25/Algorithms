package OOPs.Overloading;

class Test2
{
	void display(String a)
	{
		System.out.println(a);
	}
	void display(int a)
	{
		System.out.println(a);
	}
}
class MethodOverloading2
{
	public static void main(String[] args)
	{
		Test2 t=new Test2();
		t.display(10);
		t.display("deepak");
	}
}