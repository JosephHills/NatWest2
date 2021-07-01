package com.qa.dogs;

public class Doggo {
	
	public static void whileLoop() {
		int dogs = 0;
		boolean notEnoughDogs = true;
		
		while (notEnoughDogs) {
			System.out.println("gimmie a dog");
			dogs++;
			System.out.println("Dog Count = " + dogs);
			if (dogs==10) {
				notEnoughDogs=false;
				
			}
			
			
			
			
		}
		
		
	}
	
	

}
