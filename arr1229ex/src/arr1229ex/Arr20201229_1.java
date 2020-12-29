package arr1229ex;

public class Arr20201229_1 {

	public static void main(String[] args) {
		// 03 아래의 데이터를 새로운 배열에 저장한후, 출력하세요.
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int arr2[]= new int[10];
		
		for (int i =0; i<arr.length; i++)
		{
			arr2[i] = arr[(arr.length-1)-i];
			System.out.println(arr2[i]);
		}
		
	}

}
