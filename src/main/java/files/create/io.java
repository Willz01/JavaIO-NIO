package files.create;

import java.io.File;

public class io {

	public static void main(String[] args) {
		io io = new io();
		io.createDirIO();
		io.createFileIO();
	}

	public void createDirIO() {
		try {
			String dir = "JavaIO";
			File file = new File(dir);

			// true if the directory was created, false otherwise
			if(file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createFileIO() {
		try {
			String dir = "C:\\Users\\ekane\\IdeaProjects\\JavaIO-NIO\\JavaIO\\JavaIO.txt";
			File file = new File(dir);

			// true if the file was created, false otherwise
			if(file.createNewFile()) {
				System.out.println(file.getCanonicalFile().toPath() + " created!");
			} else {
				System.out.println("Failed to create file!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
