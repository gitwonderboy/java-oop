public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Wonderboy", 1, 20000);
		employee.setComplaints("Take long to respond");
		employee.setComplaints("Always away");
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		employee.listComplaints();
	}
}