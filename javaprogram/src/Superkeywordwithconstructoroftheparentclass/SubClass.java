package Superkeywordwithconstructoroftheparentclass;

public class SubClass extends ParentClass
{
	public SubClass()
	{
		System.out.println("Child Class default Constructor");
	}
	public static void main(String args[])
	{
		SubClass s = new SubClass();
	}
}