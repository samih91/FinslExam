

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] randomNumbers = new int[500];
		for (int i = 0; i < 500; i++) {
			randomNumbers[i] = rand.nextInt(1000) + 1;
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Nth smallest number: ");
		int n = sc.nextInt();

		Arrays.sort(randomNumbers);
		System.out.println("The " + n + "th smallest number is: " + randomNumbers[n - 1]);
	}
}
//This generates a list of 500 random numbers between 1 and 1000, sorts the list, and returns the Nth smallest number based on the user's input.
