package week10;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab10d {

	public static void main(String[] args) {

		final String FILENAME = "StudentTestGrades.csv";
		File students = new File(FILENAME);
		Scanner readstud = null;



		try {
			readstud = new Scanner(students);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}

		ArrayList<String[]> classRoster = new ArrayList<String[]>();

		while (readstud.hasNext()) {
			String[] line = readstud.nextLine().split(",");
			classRoster.add(line);
		}
		readstud.close();

		for (int i = 0; i < classRoster.size(); i++) {
			String[] student = classRoster.get(i);

			if (i == 0) {
				System.out.println("--------------------------------------------------------------------");
				System.out.printf("%-25s%-10s%-10s%-10s%n", student[0], student[1], student[2], student[3]);
				System.out.println("--------------------------------------------------------------------");
			} else {
				System.out.printf("%-25s%-10s%-10s%-10s%n", student[0], convertGrades(Integer.parseInt(student[1])),convertGrades(Integer.parseInt(student[2])), convertGrades(Integer.parseInt(student[3])));
			}
		}
	}

	public static String convertGrades(int grade) {

		if (grade > 94) {
			return "A";
		} else if (grade > 90) {
			return "A-";
		} else if (grade > 87) {
			return "B+";
		} else if (grade > 84) {
			return "B";
		} else if (grade > 80) {
			return "B-";
		} else if (grade > 77) {
			return "C+";
		} else if (grade > 74) {
			return "C";
		} else if (grade > 70) {
			return "C-";
		} else if (grade > 67) {
			return "D+";
		} else if (grade > 64) {
			return "D";
		} else if (grade > 60) {
			return "D-";
		}
		return "E";
	}

}
