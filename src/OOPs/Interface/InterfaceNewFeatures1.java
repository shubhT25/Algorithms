package OOPs.Interface;

interface I5
{
	default void show()
	{
		System.out.println("i am default method");
	}
}
class Test implements I5
{
	
}
class InterfaceNewFeatures15
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.show();
	}
}