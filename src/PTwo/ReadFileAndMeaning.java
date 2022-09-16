package PTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileAndMeaning {

	public static void main(String[] args) {
		
		doesFIleExist("D:\\TakeHomeFinalExam\\PracticeTwo\\src\\FileReader.txt");
		

	}
	
	public static void doesFIleExist(String path) {
		File file = new File(path);
		Scanner myReader;
		try {
			myReader = new Scanner(file);
			
			while(myReader.hasNextLine()) {
			String part[] = myReader.nextLine().split("-|\\,");		
				for(String word : part) {
					System.out.println(word);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
