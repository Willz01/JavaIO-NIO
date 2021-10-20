import files.create.io;
import files.create.nio;

import java.time.Instant;

public class Main {


	public static void main(String[] args) {
		TimeUtils timeUtils = new TimeUtils();

		String content = "String content string content string content string " +
				"content string content string content string content string content" +
				"string content string content string content string content string content string content";

		files.create.io createIO = new io();
		files.create.nio createNIO = new nio();

		files.write.io writeIO = new files.write.io();
		files.write.nio writeNIO = new files.write.nio();

		files.read.io readIO = new files.read.io();
		files.read.nio readNIO = new files.read.nio();

		files.update.io updateIO = new files.update.io();
		files.update.nio updateNIO = new files.update.nio();


		System.out.println("DIR CREATION");

		Instant start = timeUtils.onStart();
		createIO.createDirIO();
		Instant end = timeUtils.onEnd();
		System.out.println("TIME(ms) CREATE DIR IO: " + timeUtils.delta(start, end));

		start = timeUtils.onStart();
		createNIO.createDirNIO();
		end = timeUtils.onEnd();
		System.out.println("TIME(ms) CREATE DIR NIO: " + timeUtils.delta(start, end));

		System.out.println("*****************************");

		System.out.println("FILE CREATION");

		start = timeUtils.onStart();
		createIO.createFileIO();
		end = timeUtils.onEnd();
		System.out.println("TIME(ms) CREATE FILE IO: " + timeUtils.delta(start, end));


		start = timeUtils.onStart();
		createNIO.createFileNIO();
		end = timeUtils.onEnd();
		System.out.println("TIME(ms) CREATE FILE NIO: " + timeUtils.delta(start, end));

		System.out.println("*****************************");

		System.out.println("WRITE FILE");

		start = timeUtils.onStart();
		writeIO.writeIO(content);
		end = timeUtils.onEnd();
		System.out.println("TIME(ms) WRITE FILE IO: " + timeUtils.delta(start, end));

		start = timeUtils.onStart();
		writeNIO.writeNIO(content);
		end = timeUtils.onEnd();
		System.out.println("TIME(ms) WRITE FILE NIO: " + timeUtils.delta(start, end));

		System.out.println("*****************************");

		System.out.println("READ FILE");

		start = timeUtils.onStart();
		readIO.readIO();
		end = timeUtils.onEnd();
		System.out.println("TIME(ms) READ FILE IO: " + timeUtils.delta(start, end));

		start = timeUtils.onStart();
		readNIO.readNIO();
		end = timeUtils.onEnd();
		System.out.println("TIME(ms) READ FILE NIO: " + timeUtils.delta(start, end));

		System.out.println("*****************************");

		System.out.println("UPDATE FILE");

		start = timeUtils.onStart();
		updateIO.updateIO(content);
		end = timeUtils.onEnd();
		System.out.println("TIME(ms) UPDATE FILE IO: " + timeUtils.delta(start, end));

		start = timeUtils.onStart();
		updateNIO.updateNIO(content);
		end = timeUtils.onEnd();
		System.out.println("TIME(ms) UPDATE FILE NIO: " + timeUtils.delta(start, end));
	}


}
