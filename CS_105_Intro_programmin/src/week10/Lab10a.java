package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10a {

	public static void main(String[] args) {
	
    File students = new File ("StudentAssignmentScores.csv");
    Scanner readstud = null;
    
    try {
		readstud = new Scanner(students);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} 
    
    while (readstud.hasNext()) {
    
    	System.out.println(readstud.nextLine());
    
    }
    	
		
	}

}
