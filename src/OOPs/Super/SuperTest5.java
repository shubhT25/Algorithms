package OOPs.Super;

class A8
{
	A8()
	{
		super(); //calls object class constructor
		System.out.println("i am A class constructor");
	}
}
class B8 extends A8
{
	B8()
	{
		System.out.println("i am in B class constructor");
		//super(); 	error because call to super must be first statement in constructor
	}
	void m2() {
		System.out.println("i am in B class method");
		//super(); error must be the first statement
	}
}

class SuperTest5
{
	public static void main(String[] args)
	{
		B8 ob=new B8();
	}
}