public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Wonderboy", 1, 20000);
		employee.setComplaints("Take long to respond");
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getComplaints()[0]);
	}
}