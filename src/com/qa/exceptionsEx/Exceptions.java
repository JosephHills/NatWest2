package com.qa.exceptionsEx;

public class Exceptions {
	
	public static void main(String[] args) {
		
	}
	

	public double divide(double x, double y) throws ArithmeticException {

		if (x == 0 || y == 0) {
			throw new ArithmeticException("can't do that");

		}

		return x / y;
	}

	public void checkNumbers(double x, double y) {

		try {
			Double.valueOf(y);
		} catch (NumberFormatException e) {
			System.out.println("First number invalid" + e);
		} finally {
			System.out.println("First number is " + x);
		}

		try {
			Double.valueOf(y);
		} catch (NumberFormatException e) {
			System.out.println("First number invalid" + e);
		} finally {
			System.out.println("First number is " + x);
		}
		
		try {
			System.out.println(x + "/" + y + "=" + divide(x, y));
		}
		catch(ArithmeticException e) {
			System.out.println("Sorry something went wrong" + e.getMessage());
		}
		
		
		
		
		
		
	}
}
