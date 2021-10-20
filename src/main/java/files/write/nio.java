package files.write;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class nio {

	public void writeNIO(String content) {
		try {
			Path path = Paths.get("./JavaNIO/JavaNIO.txt");
			Files.write(path, content.getBytes(StandardCharsets.UTF_8));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
