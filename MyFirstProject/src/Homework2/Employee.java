package Homework2;

public class Employee {
	int ID;
	int result1;
	String name;
    String result2;
	
	Employee(int ID, String name)
	{
		this.ID = ID;
		this.name = name;
	}
	
	public int EmployeeID()
	{
		result1 = ID;
		return result1;
	}
	
	public String Employeename()
	{
	     result2 = "name";
         return result2;
	}
}

