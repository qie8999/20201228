package darray1229;

public class Arr_5_90 {

	public static void main(String[] args) {
		// array 2
		int arr[]= new int[100];
		
		for(int i=0; i<arr.length; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
			if(i== 90) {
				break;
			}
		}

	}

}
