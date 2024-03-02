package OOPs.Inheritance;

class A1
{
	private int aa=10;
	public void show()
	{
		System.out.println("hi");
	}
}
class B1 extends A1
{

}
class InheritanceMain2
{
	public static void main(String[] args)
	{
		B1 ob=new B1();
		//System.out.println(ob.aa);
		ob.show();
	}
}