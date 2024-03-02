package OOPs.Inheritance;

class AA
{
	void show1()
	{
		System.out.println("i am in class S");
	}
}
class BB extends AA
{
	void show2()
	{
		System.out.println("i am in class B");
	}
}
class CC extends AA
{
	void show3()
	{
		System.out.println("i am in class C");
	}
}
class HierarchicalInheritance
{
	public static void main(String[] args)
	{
		AA ob1=new AA();
		ob1.show1();

		BB ob2=new BB();
		ob2.show2();
		ob2.show1();

		CC ob3=new CC();
		ob3.show3();
		ob3.show1();
	}
}