package darray1229;

public class Arr3 {

	public static void main(String[] args) {
		// length써서 이차원 배열 표현

		// 이차원 배열을 만들면서 바로 숫자를 넣어줌
		int arr[][] = { { 1, 2, 3 }, // 1행
				{ 4, 5, 6 }, // 2행
				{ 7, 8, 9 }, // 3행
				{ 10, 11, 12 } // 4행
		};

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		int[][] arr2 = { 
		//행은 고정
		//자바에서는 크기는 명시하지 않아도 됨		
				{ 1, 2, 3 }, 
				{ 4, 5 }, 
				{ 6, 7, 8 }, 
				{ 9 } };
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j <arr2[i].length; j++) {
									//열의 사이즈
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
