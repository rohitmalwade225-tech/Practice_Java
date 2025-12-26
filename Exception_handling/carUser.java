

import java.util.Scanner;


class CarStoppedException extends Exception
{

	public CarStoppedException(String Message) {
		super(Message);
	}

	public CarStoppedException() {
		
	}
	
}

class CarPunctureException extends Exception
{

	public CarPunctureException(String Message) {
		super(Message);
	}
	
}

class CarHeatException extends Exception
{

	public CarHeatException(String Message) {
		super(Message);
		
	}
	
}

class CarTest
{
	public static void Stop(String Status) throws CarStoppedException
	{
	if(Status.equalsIgnoreCase("Stop"))
	{
		throw new CarStoppedException("Car stop for some reason.");
		
	}
	else
	{
		IO.println("Car is Started");
	}
	

	}
	
	
	
	public static void puncture (String Status) throws CarPunctureException
	{
		if(Status.equalsIgnoreCase("Puncture"))
		{
			throw new CarPunctureException("Car is puncture");
			
		}
		else
		{
			IO.println("Car not punctured.");
		}
		
	}
	
	public static void carHeat(int carheat) throws CarHeatException
	{
		if(carheat>50)
		{
			throw new CarHeatException("Car is heated more than 50 degree Celsius");
		
		}
		else
		{
			IO.println("Car temperature normal.");
		}
	}
}



public class CarUser {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try
		{
			String str = sc.nextLine();
			CarTest.Stop(str);
		} 
		catch (CarStoppedException e) {
			
			System.out.println(e.getMessage());
		}
		try
		{
			String str = sc.nextLine();
			CarTest.puncture(str);
			
		}
		catch(CarPunctureException e)
		{
			IO.println(e.getMessage());
		}
		try
		{
		int s = Integer.parseInt(IO.readln());	
		CarTest.carHeat(s);
		}
		catch(CarHeatException e)
		{
			IO.println(e.getMessage());
		}
	}
	
	

}
