package darray1229;

public class Arr_my3 {

	public static void main(String[] args) {
		// 6�� ������ ������� ������ �迭�� ������ ��, ������� ����ϼ���
		int[][] arr= new int [9][8];
		
		for (int i =1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				//i�� j�� 1,2 ���� �����ϸ� �迭0~1�� ��� �ȴ�
				//�迭�� �� ä���ַ��� �ؿ� ������ �����Ѵ�
				arr[i-1][j-2] = i*j;
				System.out.printf("%d x %d = %d \t",j,i,arr[i-1][j-2]);
			}
			System.out.println();
		}

	}

}
