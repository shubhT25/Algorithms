package OOPs.This;

class ThisDemo4
{
	void m1()
	{
		System.out.println("i am in m1 method");
		m2();
		this.m2();
	}
	void m2()
	{
		System.out.println("i am in m2 method");
	}
	public static void main(String[] args)
	{
		ThisDemo4 ob=new ThisDemo4();
		ob.m1();
	}
}