package Lambda.Practice_Java.Array;

import java.util.Scanner;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class EmployeeTest {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employee");
		int size = Integer.parseInt(sc.nextLine());
		
		Employee employees[] = new Employee[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter employee id:");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter employee Name:");
			String name = sc.nextLine();
			
			System.out.println("Enter employee Salary:");
			double salary = Double.parseDouble(sc.nextLine());
			
			employees[i] = new Employee(id,name,salary);
			
		}
		System.out.println("===== Employee Details =====");
		
		for(Employee e : employees)
		{
			System.out.println(e);
		}
		sc.close();
	}

}

