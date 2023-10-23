package assign01;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.displayEmployee();
		
		e1.acceptEmployee();
		e1.displayEmployee();
		
		e1.EmployeeRaise();
		
		e2.displayEmployee();
		
		e2.acceptEmployee();
		e2.displayEmployee();
		
		e2.EmployeeRaise();
	}

}