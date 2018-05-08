package ro.crystal.demo.writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import ro.crystal.demo.MockData;
import ro.crystal.demo.student.Student;

/**
 * <code>Class</code> which defines functionality to write objects to file.
 * 
 * @author <a href="mailto:iulia.iscru@crystal-system.ro">Iulia Iscru</a>
 *
 */
public class ReadWriteData {
	private static final String VARIABLE_DELIMITER = ",";

	public void writeStudentsToFile(final String fileName) {
		final List<Student> students = MockData.getInstance().getAllStudents();
		final File file = new File(fileName);
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			for (Student student : students) {
				bw.write(student.getFirstName() + VARIABLE_DELIMITER + student.getLastName() + VARIABLE_DELIMITER
						+ student.getCNP() + VARIABLE_DELIMITER + student.getAge() + VARIABLE_DELIMITER
						+ student.getClassName());
				bw.newLine();
			}
		} catch (final IOException exception) {
			System.out.println("Error when creating a file to be written or when writing data to file ");
			exception.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.flush();
					bw.close();
				} catch (final IOException exception) {
					System.out.println("Error when closing file!!");
					exception.printStackTrace();
				}
			}
		}

	}

	public void readStudentsFromFile(final String fileName) {
		BufferedReader br = null;
		try {
			String currentLine;
			br = new BufferedReader(new FileReader(fileName));
			while ((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}

		} catch (final IOException e) {
			System.out.println("Error occured when reading data from file.");
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (final IOException ex) {
				System.out.println("Error occured when closing reader.");
				ex.printStackTrace();
			}

		}

	}

}
