
public class Qu3 {
	
	public static void main(String args[]) {
		
		int arr[] = {4,3,6};
		int diff;
		
		for (int i=0; i<arr.length - 1; i++) {
			diff = Math.abs(arr[i] - arr[i+1]);
			System.out.println("diff = " + diff);
		}
		
	}
	
}
