package darray1229;

public class Arr2 {

	public static void main(String[] args) {
		// �����԰� �ϴ� ������ �迭2
		
		int arr[][] = new int[4][3];
		//i,j��� �ڵ� 0���� ����
		int value = 1;
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				

			arr[i][j] =value++;
			System.out.println("����� : " +arr[i][j]);
					}
		}//for �߰�ȣ�� ������ �ڿ��� ij�� ������ ���� ���Ѵ�
		//����������� �Ѵ�
		for (int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

}
