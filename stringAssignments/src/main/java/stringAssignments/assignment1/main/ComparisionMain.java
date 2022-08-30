package stringAssignments.assignment1.main;

import stringAssignments.assignment1.model.StringComparision;
import stringAssignments.assignment1.service.ComparisionValidation;

public class ComparisionMain {

	public static void main(String[] args) {
		StringComparision stringComparision = new StringComparision("Bharath", "Bharath");
		ComparisionValidation comparisionValidation = new ComparisionValidation();
		System.out.println(comparisionValidation.comparisionValidation(stringComparision));

	}

}
