
public class Employee {
	int empId; // state == property
	String empFirstName;
	String empLastName;
	char empGender;
	float salary;

	// method== function == behavior
	void empFullName() {
		System.out.println(empFirstName + " " + empLastName);
	}

	// method for returning employee name with return
	String fullName(String firstName, String lastName) {
		return ("Employee fullname is : " + firstName + " " + lastName);
	}

	// method for comparing the employee's salaries
	String comparingSalaries(float emp1Salary, float emp2Salary) {
		String comparision;
		if (emp1Salary > emp2Salary) {
			comparision = "Employee-1 is drawing higher salary ";
		} else {
			comparision = "Employee-2 is drawing higher salary ";
		}
		return comparision;
	}

}
