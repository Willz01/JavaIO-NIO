package files.read;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class nio {


	public void readNIO() {
		try {
			Path path = Paths.get("./JavaNIO/JavaNIO.txt");
			List<String> data = Files.readAllLines(path);

			for(String line : data) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
