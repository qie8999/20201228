package darray1229;

public class Arr_sum_ave {

	public static void main(String[] args) {
		// array 1.
		int arr[] = {20, 34, 22, 14, 36, 23, 67, 25, 99, 88};
		int sum = 0;
		int ave = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			ave = sum / arr.length;
		}
		System.out.printf("ÇÕ°è : %d , Æò±Õ : %d ",sum, ave);

	}

}
