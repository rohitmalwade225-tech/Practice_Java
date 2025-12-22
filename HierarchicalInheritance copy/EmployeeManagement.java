package HierarchicalInheritance;



import java.io.PrintStream;
import java.util.Scanner;

public class EmployeeManagement {

	private static final PrintStream IO = null;

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Choice\n1]Permanent Employee\n2]Constractbase Employee");

		int choice = Integer.parseInt(sc.nextLine());

		switch (choice) {
		case 1:

			System.out.println("Enter contract employee Id :");
			int employeeId = Integer.parseInt(sc.nextLine());
    IO.println();
			System.out.println("Enter contract employee Name:");
			String employeeName = sc.nextLine();

			System.out.println("Enter contract employee Salary :");
			double employeeSalary = Double.parseDouble(sc.nextLine());

			PermanentEmployee p = new PermanentEmployee(employeeId, employeeName, employeeSalary);
			System.out.println(p);
			p.netSalary();

			break;

		case 2:

			System.out.println("Enter contract employee Id :");
			int employeeId1 = Integer.parseInt(sc.nextLine());

			System.out.println("Enter contract employee Name:");
			String employeeName1 = sc.nextLine();

			System.out.println("Enter contract employee Salary :");
			double employeeSalary1 = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter contract duration in year:");
			int contractDuration = Integer.parseInt(sc.nextLine());

			ContractEmployee con = new ContractEmployee(employeeId1, employeeName1, employeeSalary1,contractDuration);
			System.out.println(con);

		
			
			
		}

	}

}


class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double employeeSalary;

	public Employee(int employeeId, String employeeName, double employeeSalary) {

		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

}

class PermanentEmployee extends Employee {
	protected double providentfund;

	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);

		this.providentfund = employeeSalary * 0.12;

	}

	@Override
	public String toString() {
		return "PermanentEmployee [providentfund=" + providentfund + ", employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeSalary=" + employeeSalary + "]";
	}

	public void netSalary() {
		double netSalary = employeeSalary + providentfund;
		System.out.println("netSalary is :" + netSalary);
	}
}

class ContractEmployee extends Employee {
	protected int contractDuration;


	public ContractEmployee(int employeeId, String employeeName, double employeeSalary,int years) {
		super(employeeId, employeeName, employeeSalary);
		this.contractDuration=years;
		

	}

	@Override
	public String toString() {
		return "ContractEmployee [contractDuration=" + contractDuration + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + "]";
	}

}