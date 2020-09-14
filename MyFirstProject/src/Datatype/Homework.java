package Datatype;

public class Homework {

	public static void main(String[] args) {
		
		//division of two float numbers
        float mynum1 = 5.86f;
		float mynum2 = 4.49f;
		float result = mynum1/mynum2;
		System.out.println("practicing float"  +result);
		
		
		//2 Area of circle
				double c = 2;
				double area_circle = 3.14*c*c;
				System.out.println("practicing area_circle .. "+area_circle);
				
		
		//fahrenheit to Celsius conversion
                double celsius;
				double fahrenheit = 78;
				celsius = (fahrenheit - 32)*5/9;
				System.out.println("temp in celsius.."+celsius);
				
				
		//your name and length of your name
				String myname = "sehrish ayubi";
				System.out.println("print my name..." +myname);
				int length = myname.length();
				System.out.println("print length..."+length);
		
				
		//print two Strings (Print - firstName lastName)
				String FN_1 = "sehrish";
				String LN_2 = "ayubi";
				System.out.println("print first name..."+FN_1);
				System.out.println("print last name..."+LN_2);
		
				
		//John's age is greater than minimum age
				int john = 20;
				if (john <= 18) {
					System.out.println("john is 18 or younger");
				}
				else {
					System.out.println("john is older then 18");
				}

		
	}

}
