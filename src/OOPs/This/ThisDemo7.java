package OOPs.This;

class Test7
{
	void m1()
	{
		System.out.println("1");

		m2(this);
	}
	void m2(Test7 t)
	{
		System.out.println(t);
	}
}
class ThisDemo7
{
	public static void main(String[] args)
	{
		Test7 t=new Test7();
		t.m1();
	}
}