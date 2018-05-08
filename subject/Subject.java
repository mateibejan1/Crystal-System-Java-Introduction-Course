package ro.crystal.demo.subject;

/**
 * <code>Enum</code> defining a limited set of values representing the studying
 * subjects.
 * 
 * @author <a href="mailto:iulia.iscru@crystal-system.ro">Iulia Iscru</a>
 *
 */
public enum Subject {
	SUBJECT_1("Subject 1"), SUBJECT_2("Subject 2"), SUBJECT_3("Subject 3"), SUBJECT_4("Subject 4"), SUBJECT_5(
			"Subject 5");
	private String value;

	private Subject(final String pValue) {
		value = pValue;
	}

	public String getValue() {
		return value;
	}
}
