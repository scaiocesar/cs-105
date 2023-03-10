package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10c {

	public static void main(String[] args) {

		File students = new File("StudentAssignmentScores.csv");
		Scanner readstud = null;
		String line = "";

		try {
			readstud = new Scanner(students);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		/* Print the header

			Student                                  Assignment with 0
			____________________________________________________________
		*/
		System.out.printf("%-40s %-20s %n","Student","Assignment with 0");
		int spaces = 60;
		System.out.println(String.format("%" + spaces + "s", "").replace(" ","_"));

		while (readstud.hasNext()) {
			line = readstud.nextLine();
			String [] arrayLine = line.split(",");
			// Since we don't need to check the position[0] which is the name we can start from 1
			for (int i = 1; i < arrayLine.length; i++) {
				if("0".equalsIgnoreCase(arrayLine[i])){
					System.out.printf("%-40s %-20s %n", arrayLine[0], i);
				}
			}
		}
	}
}
