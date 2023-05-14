public class Employee {
	// Class Scope
	private String name;
	private int employee_id;
	private double salary;
	private String[] complaints;

	public Employee(String name, int employee_id, double salary) {
		// Method Scope
		// (this) The term key-word refers to class attributes.
		this.name = name;
		this.employee_id = employee_id;
		this.salary = salary;
		this.complaints = new String[10];
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
