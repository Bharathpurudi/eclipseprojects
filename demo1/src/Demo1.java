
public class Demo1 {

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5, 6 };
		// While loop
		int x = 0; // Initialization
		while (x < myArray.length) { // condition
			System.out.println(myArray[x]);
			x++; // Updating
		}
		// For loop
		int j = 0; // Initialization
		for (int i = 0; i < myArray.length; i++) { // condition
			j = j + myArray[i];
		}
		System.out.println(j);

		// Enhanced for loop
		for (int z : myArray) {
			System.out.println(z);
		}
	}
}