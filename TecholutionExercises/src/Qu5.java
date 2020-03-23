public class Qu5 {

	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6};
		int even = 0; 
        int odd = 0; 

        for (int i = 0; i < arr.length; i++) { 
        	if (i % 2 == 0) 
                even = Math.abs(even - arr[i]); 
            else
                odd = Math.abs(odd - arr[i]); 
        }
        System.out.println("Even Index absolute difference : " + even);
	}

}
