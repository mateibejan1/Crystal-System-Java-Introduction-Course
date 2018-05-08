package ro.crystal.demo;

import java.util.List;

import ro.crystal.demo.student.Student;

public class StudentMainClass {

	public static void main(String[] args) {
		final List<Student> students = MockData.getInstance().getAllStudents();
		for (Student student : students) {
			System.out.println(student + "\n");
		}
	}

}
