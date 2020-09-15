package Homework2;

public class Student {
	int age;
	int result1;
	String name;
	String result2;

	
	Student(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	public int Studentage()
	{
		result1 = age;
		return result1;
	}
	public String Studentname()
	{
		result2 = name;
		return result2;
	}

}
