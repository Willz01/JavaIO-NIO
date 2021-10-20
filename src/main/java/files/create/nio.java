package files.create;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class nio {

	public static void main(String[] args) {
		nio nio = new nio();
		nio.createDirNIO();
		nio.createFileNIO();
	}

	public void createDirNIO() {
		try {
			Path path = Paths.get("JavaNIO");
			Path p = Files.createDirectory(path);
			System.out.println("NIO directory created: " + p.getFileName().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createFileNIO() {
		try {
			Path path = Paths.get("./JavaNIO/JavaNIO.txt");

			Path p = Files.createFile(path);
			System.out.println("NIO file created: " + p.getFileName().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
