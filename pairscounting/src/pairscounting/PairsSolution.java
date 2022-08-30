package pairscounting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PairsSolution {
	
	public static int findUniquePairs(int nums, int[] numsArray) {
		return 1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] numString;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Max Marker: ");
		int maxMarker = scanner.nextInt();
		System.out.println("Enter the sprints: ");
		numString = bi.readLine().split(" ");
		int[] numsArray = new int[numString.length];
		for (int i = 0; i < numString.length; i++) {
			numsArray[i] = Integer.parseInt(numString[i]);
		}
	}
}
