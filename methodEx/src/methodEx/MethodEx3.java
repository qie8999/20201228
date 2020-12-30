package methodEx;

import java.util.Random;
import java.util.Scanner;

public class MethodEx3 {

	public static void func(int guk, int yeong, int su) {
		int sum = guk + yeong + su;
		int ave = sum / 3;
		System.out.println("국영수 합계 : " + sum);
		System.out.println("국영수 평균 : " + ave);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("국어 점수 : ");
		int guk = s.nextInt();
		System.out.println("영어 점수 : ");
		int yeong = s.nextInt();
		System.out.println("수학 점수 : ");
		int su = s.nextInt();
		if ((guk < 0 || yeong < 0 || su < 0) || (guk > 100 || yeong > 100 || su > 100)) {
			System.out.println("에러");
			
		}
		func(guk, yeong, su);
		System.out.println("메소드 종료");
	}

}
