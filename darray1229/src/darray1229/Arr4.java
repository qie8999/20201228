package darray1229;

import java.util.Scanner;

public class Arr4 {

	public static void main(String[] args) {
		// 
		Scanner s = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int row = s.nextInt();
		System.out.print("���� ���� �Է� : ");
		int col = s.nextInt();
		
		int arr[][] = new int[row][col];
		int value =1;
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++) {
				arr[i][j] =value++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.printf("arr[0][0] ~ arr[%d][%d]\n",row,col);
		

	}

}
