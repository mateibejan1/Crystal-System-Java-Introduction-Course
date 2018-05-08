package ro.crystal.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ro.crystal.demo.grade.Grade;
import ro.crystal.demo.student.Student;
import ro.crystal.demo.student.Student.Address;
import ro.crystal.demo.subject.Subject;

/**
 * <code>Mock data</code> for {@link Student} and {@link Grade}.
 * 
 * @author <a href="mailto:iulia.iscru@crystal-system.ro">Iulia Iscru</a>
 *
 */
public final class MockData {
	public static final String CLASS_A = "CLASS A";
	public static final String CLASS_B = "CLASS B";
	public static final String CLASS_C = "CLASS C";
	private static MockData instance = new MockData();
	private List<Student> students;
	private List<Grade> studentsGrades;

	private MockData() {
		// No implementation needed
	}

	public static MockData getInstance() {
		return instance;
	}

	public Student createStudent(final String firstName, final String lastName, final String className,
			final String CNP, final int age, final char gender) {
		final Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setClassName(className);
		student.setCNP(CNP);
		student.setAge(age);
		student.setGender(gender);
		return student;
	}

	public Grade createGradeForStudent(final Student student, final Double value, final Date examDate,
			final String subject) {
		final Grade grade = new Grade();
		grade.setSubject(subject);
		grade.setValue(value);
		grade.setExamDate(examDate);
		grade.setStudent(student);
		return grade;
	}

	public List<Grade> getAllStudentsGrades() {
		if (studentsGrades == null) {
			studentsGrades = new ArrayList<Grade>();
			if (students == null) {
				students = getAllStudents();
			}
			for (Student student : students) {
				studentsGrades.add(createGradeForStudent(student, 7.5, new Date(), Subject.SUBJECT_1.getValue()));
				studentsGrades.add(createGradeForStudent(student, 5.5, new Date(), Subject.SUBJECT_3.getValue()));
				studentsGrades.add(createGradeForStudent(student, 8.00, new Date(), Subject.SUBJECT_2.getValue()));
				studentsGrades.add(createGradeForStudent(student, 9.00, new Date(), Subject.SUBJECT_4.getValue()));
				studentsGrades.add(createGradeForStudent(student, 9.5, new Date(), Subject.SUBJECT_5.getValue()));
				student.setGrades(studentsGrades);
			}
		}
		return studentsGrades;
	}

	public List<Student> getAllStudents() {
		if (students == null) {
			students = new ArrayList<Student>();
			// Class A students

			final Student studentA = createStudent("Popescu", "Marius", CLASS_A, "2951108345678", 20, 'M');
			final Address addressA = studentA.new Address("Street A", 12, "City A"); // set
																						// values
																						// to
																						// address
			studentA.setAddress(addressA.toString()); // set address information
														// for
														// student A

			final Student studentB = createStudent("Ionescu", "Maria", CLASS_A, "2951108345677", 20, 'F');
			final Address addressB = studentB.new Address("Street B", 22, "City B");
			studentB.setAddress(addressB.toString());

			final Student studentC = createStudent("Popescu", "Ionut", CLASS_A, "1951108345679", 20, 'M');
			final Address addressC = studentC.new Address("Street C", 32, "City A");
			studentC.setAddress(addressC.toString());

			// Add created students to list
			students.add(studentA);
			students.add(studentB);
			students.add(studentC);

			// Class B students
			final Student studentD = createStudent("Ivan", "Maria", CLASS_B, "2951108345680", 20, 'F');
			final Address addressD = studentC.new Address("Street D", 32, "City D");
			studentD.setAddress(addressD.toString());

			final Student studentE = createStudent("Ispas", "Andrei", CLASS_B, "1951108345681", 20, 'M');
			final Address addressE = studentC.new Address("Street E", 38, "City A");
			studentE.setAddress(addressE.toString());

			final Student studentF = createStudent("Nemes", "Dan", CLASS_B, "1951108345683", 20, 'M');
			final Address addressF = studentF.new Address("Street F", 32, "City F");
			studentF.setAddress(addressF.toString());

			// Add created students to list
			students.add(studentD);
			students.add(studentE);
			students.add(studentF);
			// Same for Class C -> define some instances of student class and
			// add
			// them to the list
		}
		return students;
	}
}
