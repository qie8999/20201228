package darray1229;

public class Arr_my1 {

	public static void main(String[] args) {
		// 04 아래의 이차원 배열을 출력하세요.
		int arr[][] = {{1, 2},{2, 4},{3, 6},{4, 8},{5, 10}};
		int result =0;
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				result = (i+1)*(j+1);
				System.out.printf("arr[%d][%d] = %d , ",i,j,result);
			}
			System.out.println();
		}
		

	}

}
