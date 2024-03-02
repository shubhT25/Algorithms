package OOPs.Overloading;

class Test7
{
	void display(int a)
	{
		System.out.println("First method : "+a);
	}
	void display(int... a)
	{
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class MethodOverloading7
{
	public static void main(String[] args)
	{
		Test7 t=new Test7();
		t.display();
		t.display(10);
		t.display(20,30);
	}
}