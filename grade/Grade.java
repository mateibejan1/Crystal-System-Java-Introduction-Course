package ro.crystal.demo.grade;

import java.util.Date;

import ro.crystal.demo.student.Student;

/**
 * <code>POJO</code> holding information regarding the obtained result of a
 * {@link Student} after taking a exam.
 * 
 * @author <a href="mailto:iulia.iscru@crystal-system.ro">Iulia Iscru</a>
 *
 */
public class Grade {
	private String subject;
	private Double value;
	private Date examDate;
	private Student student;
	public String getSubject() {
		return subject;
	}
	public void setSubject(final String pSubject) {
		subject = pSubject;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(final Double pValue) {
		value = pValue;
	}
	public Date getExamDate() {
		return examDate;
	}
	public void setExamDate(final Date pExamDate) {
		examDate = pExamDate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(final Student pStudent) {
		student = pStudent;
	}
	
}
