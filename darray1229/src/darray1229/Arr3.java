package darray1229;

public class Arr3 {

	public static void main(String[] args) {
		// length�Ἥ ������ �迭 ǥ��

		// ������ �迭�� ����鼭 �ٷ� ���ڸ� �־���
		int arr[][] = { { 1, 2, 3 }, // 1��
				{ 4, 5, 6 }, // 2��
				{ 7, 8, 9 }, // 3��
				{ 10, 11, 12 } // 4��
		};

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		int[][] arr2 = { 
		//���� ����
		//�ڹٿ����� ũ��� �������� �ʾƵ� ��		
				{ 1, 2, 3 }, 
				{ 4, 5 }, 
				{ 6, 7, 8 }, 
				{ 9 } };
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j <arr2[i].length; j++) {
									//���� ������
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}
}