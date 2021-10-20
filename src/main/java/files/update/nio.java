package files.update;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class nio {

	public void updateNIO(String updateContent) {
		try {
			Path path = Paths.get("./JavaNIO/JavaNIO.txt");
			Files.write(path, updateContent.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

			System.out.println(path.getFileName().toString() + " updated!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
