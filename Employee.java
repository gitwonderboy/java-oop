public class Employee {
	// Class Scope
	private String name;
	private int employeeId;
	private double salary;
	private String[] complaints;

	public Employee(String name, int employeeId, double salary) {
		// Method Scope
		// (this) The term key-word refers to class attributes.
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.complaints = new String[10];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String[] getComplaints() {
		return complaints;
	}

	public void setComplaints(String complaint) {
		for (int i = 0; i <= complaints.length; i++) {
			if (complaints[i] == null) {
				complaints[i] = complaint;
				break;
			}
		}
	}

}
