package files.update;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class io {


	public void updateIO(String updateContent) {
		try {
			File f1 = new File("./JavaIO/JavaIO.txt");
			if(!f1.exists()) {
				FileWriter fileWriter = new FileWriter(f1.getName(), true);
				BufferedWriter bw = new BufferedWriter(fileWriter);

				bw.write(updateContent);

				bw.close();
				fileWriter.close();
			}

			System.out.println(f1.getCanonicalFile() + " updated!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
