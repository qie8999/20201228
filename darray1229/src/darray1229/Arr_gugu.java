package darray1229;

public class Arr_gugu {

	public static void main(String[] args) {
	int arr[][]=new int[9][8];
	
	for(int i=1; i<=9; i++) {
		for(int j=2; j<=9; j++) {
			arr[i-1][j-2] = i*j;
			System.out.printf("%dx%d=%d \t",j,i,arr[i-1][j-2]);
		}
		System.out.println();
	}
	}

}
