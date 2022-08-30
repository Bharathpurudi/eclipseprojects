
public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.gender='M';
		student.marksInEnglish=99.5f;
		student.marksInPhysics=85.4f;
		student.studentId=100;
		student.studentName="Bharath";
		System.out.println("Student name is "+ student.studentName);
		System.out.println("Student Id is "+ student.studentId);
		System.out.println("Student marks in physics is "+ student.marksInPhysics);
		System.out.println("Student marks in english is "+ student.marksInEnglish);
		System.out.println("Student gender is "+ student.gender);
		
		System.out.println(student.namePrinting(student.studentName, 10));
		
		
	}

}
