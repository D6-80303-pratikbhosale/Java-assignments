package assign01;

import java.util.Scanner;

public class Employee {
		String firstName;
		String lastName;
		double salary;
		
		public Employee() {
			this("--","--",00.0);
		}
		
		public Employee(String firstName, String lastName, double salary) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary = salary;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public void acceptEmployee() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter First Name = ");
			this.firstName = sc.next();
			
			System.out.print("Enter Lirst Name = ");
			this.lastName = sc.next();
			
			System.out.print("Enter Salary = ");
			this.salary = sc.nextDouble();
			if(salary < 0) {
				this.setSalary(0.0);
			}
		}
		
		public void displayEmployee(){
			
			System.out.println("******Employee*******");
			System.out.println("Name :"+firstName+" "+lastName);
			System.out.println("Monthly Salary :"+ salary);
			System.out.println("Yearly Salary  : "+ (salary*12));
			
		}
		
		public void EmployeeRaise() {
			double sal = (this.getSalary() * 0.10);
			
			this.setSalary( this.getSalary() + sal );
			
			System.out.println("ew Yearly Salary  : "+ (salary*12));
		}
}