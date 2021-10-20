package files.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class io {

	public void readIO() {
		try {
			FileReader fileReader = new FileReader("./JavaIO/JavaIO.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			System.out.println("READ CONTENTS: ");
			String line;
			while ((line = bufferedReader.readLine()) != null){
				System.out.println(line);
			}

			bufferedReader.close();
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
