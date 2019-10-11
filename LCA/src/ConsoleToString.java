import java.io.PrintStream;
import java.util.Scanner;
import java.io.ByteArrayOutputStream;

public class ConsoleToString{  
	
	public void ConsoleText(){
		// Create a stream to hold the output
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		// IMPORTANT: Save the old System.out!
		PrintStream old = System.out;
		// Tell Java to use your special stream
		System.setOut(ps);
		// Print some output: goes to your special stream
		Scanner scans = new Scanner(System.in);
		System.out.println(scans.nextLine());
		// Put things back
		System.out.flush();
		System.setOut(old);
		// Show what happened
		System.out.println("Oh: " + baos.toString());
	}
}  