package files.write;

import java.io.FileWriter;
import java.io.IOException;


public class io {

	public void writeIO(String content) {
		try {
			FileWriter fileWriter = new FileWriter("./JavaIO/JavaIO.txt");
			fileWriter.write(content);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
