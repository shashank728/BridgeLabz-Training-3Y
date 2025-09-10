package Inheritance.SIngleLevel;

class Parent {
    Parent()
	{
		System.out.println("Hi, Parent Constructor!!");
	}
	
	Parent(int a)
	{
		this();
		System.out.println(a);
	}

	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}
