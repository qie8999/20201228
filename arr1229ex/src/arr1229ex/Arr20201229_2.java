package arr1229ex;

public class Arr20201229_2 {

	public static void main(String[] args) {
		// 04 �Ʒ��� ������ �迭�� ����ϼ���.
		
		int arr[][] = {{1, 2}, {2, 4}, {3, 6}, {4, 8}, {5, 10}};
		for (int i = 0; i<arr.length; i++)
		{
			for (int j =0; j <arr[i].length; j++)
			{ int result =(j+1)*(i+1);
				System.out.printf("arr[%d][%d] = %d , ",i,j,result);
			}
			System.out.println(" ");
		}

	}

}
