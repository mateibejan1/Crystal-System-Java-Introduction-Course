package ro.crystal.demo;

import java.util.Date;

import ro.crystal.demo.writer.ReadWriteData;

public class WRStudentsMain {

	public static void main(String[] args) {
		final String fileName = "students" + new Date().getTime() + ".txt";
		final ReadWriteData writeDataToFile = new ReadWriteData();
		writeDataToFile.writeStudentsToFile(fileName);
		writeDataToFile.readStudentsFromFile(fileName);
	}

}
