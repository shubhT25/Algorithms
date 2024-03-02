package OOPs.Overriding;

class A8
{
	public static void main(String[] args)
	{
		System.out.println("1");
	}
}
class B8 extends A8
{
	public static void main(String[] args)
	{
		System.out.println("2");
	}
}
class MethodOverriding8
{
	public static void main(String[] args)
	{
		A8 ob3=new B8();

		String[] str={"a", "b", "c"};
		ob3.main(str);
	}
}