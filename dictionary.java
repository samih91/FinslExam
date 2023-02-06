

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class Main2 {
	

	public static void main(String[] args) {
		
		
		String path = "dictionary.txt";
		doesFileExist(path);

		HashMap<String, String[]> dictionary = new HashMap<>();
		try {
			Scanner sc = new Scanner(new File(path));
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] words = line.split(" - ");
				String key = words[0];
				String[] meanings = words[1].split(", ");
				dictionary.put(key, meanings);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		for (String word : dictionary.keySet()) {
			System.out.println(word);
			for (String meaning : dictionary.get(word)) {
				System.out.println(meaning);
			}
		}
	}
	
	
	public static void doesFileExist(String path) {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("File does not exist at the given path: " + path);
		} else {
			System.out.println("File exists at the given path: " + path);
		}
	}
	
}
