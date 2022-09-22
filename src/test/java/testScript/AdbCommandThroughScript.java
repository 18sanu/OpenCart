package testScript;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdbCommandThroughScript {

	public static void main(String[] args) throws IOException {
		String line;
		Process p = Runtime.getRuntime().exec("adb shell pm list packages");
		
		BufferedReader input = new BufferedReader(new 
		InputStreamReader(p.getInputStream()));
		while ((line = input.readLine()) != null) {
		 System.out.println(line);
		}
		input.close();

	}

}
