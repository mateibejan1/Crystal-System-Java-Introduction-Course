package ro.crystal.demo;

import ro.crystal.demo.student.Student;

public class ComparingStudentsMain {

	public static void main(String[] args) {
		final Student studentA = MockData.getInstance().createStudent("Popescu", "Marius", MockData.CLASS_A, "1951108345678",
				20,'M');
		final Student studentB = MockData.getInstance().createStudent("Popescu", "Marius", MockData.CLASS_A, "1951108345678",
				20,'M');
		System.out.println("Student objects referring to the same student? " + studentA.equals(studentB));
		System.out.println("Student objects referring to the same student? " + (studentA == studentB));
	}

}
