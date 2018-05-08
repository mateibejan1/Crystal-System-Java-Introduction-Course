package ro.crystal.demo.exceptions;

import ro.crystal.demo.student.Student;

/**
 * <code>Custom Exception</code> which occurs when adding an invalid
 * <code>CNP</code> value to a {@link Student}, e.g if the is female the CNP
 * should start with 2 otherwise it should start with 1.
 * 
 * @author <a href="mailto:iulia.iscru@crystal-system.ro">Iulia Iscru</a>
 *
 */
public class StudentCNPException extends Exception {
	public StudentCNPException(final String message) {
		super(message);
	}

}
