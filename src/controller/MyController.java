package controller;

import java.util.Scanner;

public class MyController
{

	public void start()
	{
		moreInput();
		
		//System.out.println("Standard output for Java :D");
		//System.out.println("oh boy more words");
		//System.out.print("same line");
		//System.out.print(" as this");
	
		questions();
	}
	
	private void questions()
	{
		System.out.print("What is your favorite color, or the meaning of life?");
		Scanner InputScanner = new Scanner(System.in);
	
		String answer = InputScanner.nextLine();
		System.out.println(answer);
	
		System.out.println("What's cookin good lookin?");
		answer = InputScanner.nextLine();
		System.out.println(answer);
		
		
	
		InputScanner.close();
	}
	
	private void moreInput()
	{
		Scanner anotherInputScanner;
		
		anotherInputScanner = new Scanner(System.in);
		
		System.out.println("What is the meaning of Life, the universe and everything?");
		int answer = anotherInputScanner.nextInt();
		
		System.out.println("You typed: " + answer);
		anotherInputScanner.nextLine(); //used to consume the enter key press, ignoring the returned String value.
		System.out.println("Words - why the error? Type in a guess");
		String secondResponse = anotherInputScanner.nextLine();
		System.out.println(secondResponse);
		
		//double holds real numbers AKA numbers with a decimal point!
		double magicNumber;
		
		System.out.println("Type in your favorite fractional number AKA use a decimal");
		magicNumber = anotherInputScanner.nextDouble();
		
		System.out.println(magicNumber);
		
//		anotherInputScanner.close();
	}

	
	public boolean validInt(String example)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Type in a valid int value human!");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only floating point values are allowed for input");
		}
		
		return isValid;
	}	
	
}
	
	
		

