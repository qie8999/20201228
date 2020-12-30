package methodEx;

import java.util.Scanner;

public class MethodEx1 {
	
	public static void func(int a, int b, int c) {
		if(a > b && b > c) {
			System.out.printf("%d-%d-%d \n",a,b,c);
		}else if(a > c && c > b) {
			System.out.printf("%d-%d-%d \n",a,c,b);
		}else if(b > c && c > a) {
			System.out.printf("%d-%d-%d \n",b,c,a);
		}else if(b > a && a > c) {
			System.out.printf("%d-%d-%d \n",b,a,c);
		}else if(c > b && b > a) {
			System.out.printf("%d-%d-%d \n",c,b,a);
		}else if(c > a && a > b) {
			System.out.printf("%d-%d-%d \n",c,a,b);
		}
		System.out.println("func() 출력완료");
	}//Aarry.sort(arr);오름차순정렬로 사용해도 됨

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		func(a, b, c);

	}

}
