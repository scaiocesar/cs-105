package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10b {

	public static void main(String[] args) {

		final String FILE_NAME = "StudentAssignmentScores.csv";
		File students = new File(FILE_NAME);
		Scanner readstud = null;
		String line = "";

		try {
			readstud = new Scanner(students);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int i = 0;
		while (readstud.hasNext()) {
			line = readstud.nextLine();
			String [] arrayLine = line.split(",");
			if(i==1) {
				int spaces = 120;
				System.out.println(String.format("%" + spaces + "s", "").replace(" ","_"));
			}

			System.out.printf("%-40s %-20s %-10s %-10s %-10s %-10s %-10s %n", arrayLine[0], arrayLine[1], arrayLine[2], arrayLine[3], arrayLine[4], arrayLine[5], arrayLine[6]);
			i++;

		}

	}

}
