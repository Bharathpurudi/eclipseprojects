package sprints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSprints {

	public static List<Integer> findMaxSprintedMarker(int maxMarker, int[] sprints) {
		int i;
		int length = sprints.length;
		List<Integer> markersList = new ArrayList<Integer>();
		for (i = 0; i < length - 1; i++) {
			int firstSprint = sprints[i];
			int secondSprint = sprints[i + 1];
			if (firstSprint < secondSprint == true) {
				for (int j = firstSprint; j <= secondSprint; j++) {
					markersList.add(j);
				}
			}
			if (firstSprint > secondSprint == false) {
				for (int j = secondSprint; j > firstSprint; j--) {
					markersList.add(j);
				}
			}
		}

		return markersList;
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

		List<Integer> resList = findMaxSprintedMarker(maxMarker, numsArray);

		for (Integer integer : resList) {
			System.out.println(integer);
		}

		scanner.close();
	}

}
