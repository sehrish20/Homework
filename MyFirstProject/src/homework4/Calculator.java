package homework4;

import java.util.Scanner;

public class Calculator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            int num1, num2 = 0;
        
           Scanner cal = new Scanner(System.in);
           System.out.println("enter num1");
           num1 = cal.nextInt();
           System.out.println("enter num2");
           num2 = cal.nextInt();
           System.out.println("select operation(+,-,*,/)");
           char operation = cal.next().charAt(0);
           
           
           int result;
          
            
           switch (operation) {
           case '+':
        	   result = num1+num2;
        	  System.out.println("add" +result);
           break;
           case '-': 
        	   result = num1-num2;
        	   System.out.println("subtract"+result);
           break;
           case '*': 
        	   result = num1*num2;
        	   System.out.println("multi"+result);
           break;
           case '/':
        	   result = num1/num2;
        	   System.out.println("division"+result);
           break;
           
           
           
          
           
           
           
           
           
           
           
           }
           
            
            
            
		
		
		
		

	}

}
