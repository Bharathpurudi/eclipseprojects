package stringAssignments.assignment1.service;

import stringAssignments.assignment1.model.StringComparision;

public class ComparisionValidation {

	public String comparisionValidation(StringComparision stringComparision) {
		String string1 = stringComparision.getString1();
		String string2 = stringComparision.getString2();
		String validation;
		if (string1.equalsIgnoreCase(string2)) {
			validation="Strings are same";
		}else {
			validation ="Strings are not equal";
		}
		return validation;
	}

}
