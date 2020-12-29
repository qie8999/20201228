package darray1229;

public class A{

	public static void main(String[] args) {
	int arr[][]=new int[9][8];
	
	for(int i=2; i<=9; i++) {
		for(int j=1; j<=9; j++) {
			arr[i-2][j-1] = i*j;
			System.out.printf("%dx%d=%d \t",i,j,arr[i-2][j-1]);
		}
		System.out.println();
	}
	}

}
