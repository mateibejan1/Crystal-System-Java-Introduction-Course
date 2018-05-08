package ro.crystal.demo;

import ro.crystal.demo.exceptions.StudentCNPException;
import ro.crystal.demo.student.Student;

public class StudentCNPExceptionMain {
	public static Student createStudent(final String firstName, final String lastName, final String className,
			final String CNP, final int age, final char gender) throws StudentCNPException {
		final Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setClassName(className);
		student.setAge(age);
		// TODO treat case for 'F' and '1'
		if (CNP.charAt(0) == '2' && gender == 'M') {
			throw new StudentCNPException("CNP or gender is invalid. CNP: " + CNP + " gender: " + gender);
		}
		student.setCNP(CNP);
		student.setGender(gender);
		return student;
	}

	public static void main(String[] args) {
		try {
			final Student studentA = createStudent("Popescu", "Marius", MockData.CLASS_A, "2951108345678", 20, 'M');
			System.out.println(studentA);
		} catch (StudentCNPException e) {
			System.out.println("Exception occured!!");
			e.printStackTrace();
		}
		System.exit(0);
	}
}
