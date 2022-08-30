
public class Student {
	int studentId;
	String studentName;
	float marksInPhysics;
	float marksInEnglish;
	char gender;
	String namePrinting(String name, int times) {
		String printName = "";
		for (int i=0; i<times; i++) {
			printName += name+" ";
		}
		return printName;
	}
}
