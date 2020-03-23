import java.util.Arrays;

public class Qu4 {
	static int arr[] = new int[] { 3, 4, 5, 6, 5 };

	private static int[] rotateRight(int[] input, int length, int numOfRotations) {
		for (int i = 0; i < numOfRotations; i++) {
			// take out the last element
			int temp = input[length - 1];
			for (int j = length - 1; j > 0; j--) {
				// shift array elements towards right by one place
				input[j] = input[j - 1];
			}
			input[0] = temp;
		}
		return input;
	}

	public static void main(String args[]) {

		System.out.println("Given Array is");
		System.out.println(Arrays.toString(arr));

		rotateRight(arr, 5, 2);

		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));

	}

}
