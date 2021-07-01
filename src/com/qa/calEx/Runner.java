package com.qa.calEx;

public class Runner {

	// start EVERY Runner class with the MAIN method
	// within the 'scope' ie the first set of { }
	// type 'main' then ctrl & space, then select the first option

	public static void main(String[] args) {

		// we can then start a new class, in this case Calculator
		// this is where we will do the bulk of the coding
		// when we are ready to call the methods from our other class (calculator)
		// we start with sysout, then point to the relevant class,
		// then the name of the method
		// this particular method will expect to receive two integers in the Runner
		// class

		System.out.println("Addition result=" + Calculator.add(4, 11));
		System.out.println("Subtraction result=" + Calculator.sub(67, 11));
		System.out.println("Multiplication result=" + Calculator.mul(4, 11));
		System.out.println("Division result=" + Calculator.div(5, 2));
		System.out.println("Remainder result=" + Calculator.remainder(5, 2));
		System.out.println("Odd or Even result=" + Calculator.oddEven(5));
	}

}
