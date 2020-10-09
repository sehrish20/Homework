package Homework8;

import java.util.HashMap;


public class questionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> info = new HashMap<String, Integer>();
		info.put("david", 2000);
		info.put("angela", 2500);
		info.put("jose", 2200);
	
		
		for(String i : info.keySet())
		{
			System.out.println("name  "+i+ "  salary   "+info.get(i));
		}
		

	}

}
