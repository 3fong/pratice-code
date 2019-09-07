package io;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class OutputProperty {

	public static void main(String[] args) throws IOException {
		Properties p = System.getProperties();
		
		p.list(new PrintStream("SystemInfo.txt"));
	}

}
