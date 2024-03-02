package OOPs.Super;

class A4
{
	int no=10;
}
class B4 extends A4
{
	int no=20;
	void show(int no)
	{
		System.out.println(no);
		System.out.println(this.no);
		System.out.println(super.no);
	}
}

class SuperTest
{
	public static void main(String[] args)
	{
		B4 ob=new B4();
		ob.show(30);
	}
}