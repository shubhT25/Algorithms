package OOPs.This;

class Test9
{
	Test9 m1()
	{
		return this;
	}
}
class ThisDemo9
{
	public static void main(String[] args)
	{
		Test9 ob=new Test9();
		Test9 t=ob.m1();
		System.out.println(t);
	}
}