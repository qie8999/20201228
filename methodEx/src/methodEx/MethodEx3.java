package methodEx;

import java.util.Random;
import java.util.Scanner;

public class MethodEx3 {

	public static void func(int guk, int yeong, int su) {
		int sum = guk + yeong + su;
		int ave = sum / 3;
		System.out.println("������ �հ� : " + sum);
		System.out.println("������ ��� : " + ave);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("���� ���� : ");
		int guk = s.nextInt();
		System.out.println("���� ���� : ");
		int yeong = s.nextInt();
		System.out.println("���� ���� : ");
		int su = s.nextInt();
		if ((guk < 0 || yeong < 0 || su < 0) || (guk > 100 || yeong > 100 || su > 100)) {
			System.out.println("����");
			
		}
		func(guk, yeong, su);
		System.out.println("�޼ҵ� ����");
	}

}
