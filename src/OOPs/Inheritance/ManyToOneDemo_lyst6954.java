package OOPs.Inheritance;

class Student1
{
	String rollno;
	String name;
	
	Branch branch;

	Student1(String rollno1, String name1, Branch branch1)
	{
		rollno=rollno1;
		name=name1;
		branch=branch1;	
	}

	void getStudentDetails()
	{
		System.out.println("Student1 Rollno : "+rollno);
		System.out.println("Student1 Name : "+name);
		System.out.println("Student1 Branch Code : "+branch.branchcode);
		System.out.println("Student1 Branch Name : "+branch.branchname);
		System.out.println("------------------------------------------------");
	}
}
class Branch
{
	String branchcode;
	String branchname;

	Branch(String branchcode1, String branchname1)
	{
		branchcode=branchcode1;
		branchname=branchname1;	
	}
}
class ManyToOneDemo
{
	public static void main(String[] args)
	{
		Branch b1=new Branch("cse01", "CSE");
		
		Student1 s1=new Student1("101", "deepak", b1);
		Student1 s2=new Student1("102", "deepesh", b1);
		Student1 s3=new Student1("103", "amit", b1);

		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();
	}
}