package Lambda.Practice_Java.lambdaExression;

import java.util.function.Predicate;

public class CheckEligibility
{
void main()
{
	String name = IO.readln("Enter Customer Name");
	double salary =Double.parseDouble(IO.readln("Enter Salary:"));
	int creditCore = Integer.parseInt(IO.readln("Enter Credit Score: "));
	int age = Integer.parseInt(IO.readln("Enter Age: "));
	
	Customer c = new Customer(name,salary,creditCore,age);
	if(c.checkLoanEligibility())
	{
		IO.println(name+" is Eligible for Loan");
	}
	else
	{
		IO.println(name+" is NOT Eligible for Loan.");
	}
	

}
}
record Customer(String name,Double salary,Integer creditCore, Integer age)
{
  public boolean checkLoanEligibility()
  {
	  Predicate<Customer> Eseligible = a -> a.salary()>25000 && a.creditCore()>700 && a.age()>21;
	  return Eseligible.test(this);
  }
}

