package OOPs.Classes;

class Test
{
	int a=10;

	public static void main(String[] args)
	{
		Test ob1=new Test();
		Test ob2=new Test();

		System.out.println(ob1.a);
		System.out.println(ob2.a);

		ob1.a=20;
		System.out.println(ob1.a);
		System.out.println(ob2.a);
	}
}