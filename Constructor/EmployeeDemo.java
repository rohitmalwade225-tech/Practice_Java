package Practice_Java.Constructor;

import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String[]args) {
Scanner sc = new Scanner(System.in);


System.out.println("Enter FirstName :");
String firstName = sc.nextLine();

System.out.println("Enter LastName :");
String lastName = sc.nextLine();

System.out.println("Enter employeeID :");
int employeeID = Integer.parseInt(sc.nextLine());

System.out.println("Enter salary :");
double salary = Double.parseDouble(sc.nextLine());

System.out.println("Enter NoOfProject :");
int NoOfProject = Integer.parseInt(sc.nextLine());
Employee s = new Employee(firstName, lastName, employeeID, salary, NoOfProject);
s.calculateSalary();
System.out.println(s.toString());
}
}



public class Employee {
private String firstName;
private String lastName;
private int employeeID;
private double salary;
private int NoOfProject;
public Employee(String firstName, String lastName, int employeeID, double salary, int noOfProject) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.employeeID = employeeID;
	this.salary = salary;
	NoOfProject = noOfProject;
}

public void calculateSalary()
{
	if(NoOfProject  > 5 && NoOfProject < 10)
	{
		salary+=5000;
	}
	else if(NoOfProject > 10 && NoOfProject < 20)
	{
		salary+=10000;
	}
	else
	{
		salary+=15000;
	}
}

public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeID=" + employeeID + ", salary="
			+ salary + ", NoOfProject=" + NoOfProject + "]";
}



}

