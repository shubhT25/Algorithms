package OOPs.Inheritance;

class A2
{
	void show1()
	{
		System.out.println("1");
	}
}
class B2
{
	void show1()
	{
		System.out.println("2");
	}
}
class C2 extends B2
{

}
class MultipleInheritance
{
	public static void main(String[] args)
	{
		C2 ob=new C2();
		ob.show1();
	}
}