package OOPs.This;

class Test8
{
	void m1()
	{
		Xyz ob=new Xyz(this);
	}
}
class Xyz
{
	Xyz(Test8 t)
	{
		System.out.println(t);
	}
}
class ThisDemo8
{
	public static void main(String[] args)
	{
		Test8 t=new Test8();
		t.m1();
	}
}