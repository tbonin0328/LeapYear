import acm.program.*;


public class LeapYear extends ConsoleProgram 
{
	public void run()
	{
		println("Leap Year Test Program");
		int year = readInt("What year would you like to check? ");
		if (isLeapYear(year))
		{
			println(year + " is a leap year!");
		}
		else
		{
			println("not a leap year because year modulus 400 equals " + year % 400);
		}
		
	}
	
	private boolean isLeapYear(int year) 
	{
		return ( ((year % 4 == 0) && (year % 100 != 0)) 
				|| (year % 400 == 0) );
	}
}
