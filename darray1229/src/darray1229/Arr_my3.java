package darray1229;

public class Arr_my3 {

	public static void main(String[] args) {
		// 6번 구구단 결과값을 이차원 배열에 저장한 후, 결과값을 출력하세요
		int[][] arr= new int [9][8];
		
		for (int i =1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				//i와 j를 1,2 부터 시작하면 배열0~1이 비게 된다
				//배열을 꽉 채워주려면 밑에 식으로 수정한다
				arr[i-1][j-2] = i*j;
				System.out.printf("%d x %d = %d \t",j,i,arr[i-1][j-2]);
			}
			System.out.println();
		}

	}

}
