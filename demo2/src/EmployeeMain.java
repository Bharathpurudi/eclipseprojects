
public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee employee = new Employee(); //Instantiating employee(object)from the Employee class
		employee.empFirstName="BHARATH"; 
		employee.empLastName="PURUDI";
		employee.salary= 25000.00f;
		employee.empFullName();
		
		Employee employee2= new Employee(); //Instantiating employee2(another object)from the Employee class
		employee2.salary= 35000.00f;
		String empName= employee2.fullName("Jyothirmai", "Gorintla");
		System.out.println(empName);
		
		System.out.println("Sum of the salaries of both employees is: "+(employee.salary+employee2.salary));
		
		/*Invoking the salary comparison method from the Employee class with the arguments 
		 * of employee object salary and employee2 object salary
		 */
		
		String salaryComparision = employee.comparingSalaries(employee.salary, employee2.salary); 
		System.out.println(salaryComparision);
		
	}
}
