package jumps;

import java.util.Scanner;

public class Solution {
	
	public static int findingTotalJumps(int flagHeight, int bigJump) {
		int totalJumps=0;
		if(flagHeight<bigJump) {
			totalJumps=flagHeight;
		}else {
			int numOfBigJumps=flagHeight/bigJump;
			int numOfSmallJumps = flagHeight%bigJump;
			totalJumps = numOfBigJumps+numOfSmallJumps;
		}
		return totalJumps;
	}
	
	public static void main(String[] args) {
		Scanner scanner40 = new Scanner(System.in);
		System.out.println("Enter the height of the flag");
		int flagHeight40 = scanner40.nextInt();
		System.out.println("Enter the height of the big jump");
		int bigJump40 = scanner40.nextInt();
		int result = findingTotalJumps(flagHeight40,bigJump40);
		System.out.println("Total Jumps Required are "+ result);
		scanner40.close();
	}

}
