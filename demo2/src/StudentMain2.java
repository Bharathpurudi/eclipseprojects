
public class StudentMain2 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.gender='F';
		student1.marksInEnglish=85.2f;
		student1.marksInPhysics=96.4f;
		student1.studentId=101;
		student1.studentName="JYOTHIRMAI";
		System.out.println("Student name is "+ student1.studentName);
		System.out.println("Student Id is "+ student1.studentId);
		System.out.println("Student marks in physics is "+ student1.marksInPhysics);
		System.out.println("Student marks in english is "+student1.marksInEnglish);
		System.out.println("Student gender is "+ student1.gender);
		System.out.println("Student total marks is: " +(student1.marksInEnglish+student1.marksInPhysics));
		
		Teacher teacher = new Teacher();
			teacher.teacherId= 150;
			teacher.teacherName="Jason Karunakaran Daniel";
			teacher.gender='M';
			System.out.println("Techer name is: "+ teacher.teacherName);
	}

}
