package OOPs.Overloading;

class Test4
{
	void display(int a)
	{
		System.out.println(a);
	}
	void display(char a)
	{
		System.out.println(a);
	}
}
class MethodOverloading4
{
	public static void main(String[] args)
	{
		Test4 t=new Test4();
		t.display(10);
		t.display('d');
	}
}