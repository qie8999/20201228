package darray1229;

public class Arr_my2 {

	public static void main(String[] args) {
		// 05 �Ʒ� ����� ������ ���ϼ���
		int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int arr2[][] = {{10, 20, 30},{40, 50, 60},{70, 80, 90}};
		int[][] arr3 = new int [3][3];
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				arr3[i][j]= arr[i][j] + arr2[i][j];
				
				System.out.printf("%d \t",arr3[i][j]);
			}
			System.out.println();
		
		}
		
		
		

	}

}
