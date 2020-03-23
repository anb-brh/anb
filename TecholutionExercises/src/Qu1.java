
public class Qu1 {
	
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4,5,6};
		int even = 0;
		int odd = 0;
		int diff = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (i%2 == 0)
				even += arr[i];
			else
				odd += arr[i];
					
		}
		diff = even - odd;
		System.out.println("Even index positions sum: " + even);
		System.out.println("Odd index positions sum: " + odd);
		System.out.println("Absolute difference: " + Math.abs(diff));
	}
	
}
