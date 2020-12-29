package darray1229;

public class Arr2 {

	public static void main(String[] args) {
		// 선생님과 하는 이차원 배열2
		
		int arr[][] = new int[4][3];
		//i,j모두 자동 0으로 세팅
		int value = 1;
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				

			arr[i][j] =value++;
			System.out.println("디버깅 : " +arr[i][j]);
					}
		}//for 중괄호가 끝나는 뒤에는 ij는 영향을 주지 못한다
		//지역변수라고 한다
		for (int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

}
