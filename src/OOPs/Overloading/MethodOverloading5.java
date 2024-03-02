package OOPs.Overloading;

class Test5
{
	void display(int a)
	{
		System.out.println(a);
	}
}
class MethodOverloading5
{
	public static void main(String[] args)
	{
		Test5 t=new Test5();
		t.display('d');
		t.display(10);
	}
}