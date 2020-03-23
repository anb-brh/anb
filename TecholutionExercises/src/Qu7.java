public class Qu7 {

	public static void main(String args[]) {
		int arr[] = {10,11,5,6,8,9,4,3,15,6,4,5,1,0,4,7};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i = 0 ; i < arr.length ; i ++){
		    max = Math.max(arr[i], max);
		    min = Math.min(arr[i], min);
		}

		System.out.println(max - min);
	}
}
