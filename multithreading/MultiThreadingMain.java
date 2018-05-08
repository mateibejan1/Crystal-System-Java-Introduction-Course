package ro.crystal.demo.multithreading;

import java.util.Date;

import ro.crystal.demo.writer.ReadWriteData;

public class MultiThreadingMain {
	final String fileName = "students" + new Date().getTime() + ".txt";
	private ReadWriteData readWriteData = new ReadWriteData();
	private boolean isReadyToRead = false;

	public static void main(String[] args) {
		final MultiThreadingMain mainObject = new MultiThreadingMain();
		final Thread thread1 = new Thread(mainObject.new ReadOperation());
		final Thread thread2 = new Thread(mainObject.new WriteOperation());
		thread1.start();
		thread2.start();
	}

	private class ReadOperation implements Runnable {

		public void run() {
			synchronized (readWriteData) {
				while (!isReadyToRead) {
					try {
						readWriteData.wait();
					} catch (final InterruptedException e) {
						e.printStackTrace();
					}
				}
				readWriteData.readStudentsFromFile(fileName);
			}
		}
	}

	private class WriteOperation implements Runnable {

		public void run() {
			synchronized (readWriteData) {
				readWriteData.writeStudentsToFile(fileName);
				isReadyToRead = true;
				readWriteData.notify();
			}
		}

	}
}
