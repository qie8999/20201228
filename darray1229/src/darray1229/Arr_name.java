package darray1229;

import java.util.Random;
import java.util.Scanner;

public class Arr_name {

	public static void main(String[] args) {
		// 
		System.out.println("--------------------------");
		System.out.println("���� ���� ���α׷� v1.1");
		System.out.println("--------------------------");
		System.out.println("1. �̸� �����Ͽ� ���Ͽ� �����ϱ�");
		System.out.println("2. ���Ͽ��� �̸� �о����");
		System.out.println("3. ���α׷� ����");
		System.out.println("--------------------------");
		Scanner s = new Scanner(System.in);
		System.out.println("�޴� ���� : ");
		
		String last[] = {"��","��","��","��","��"};
		String first[]= {"��","��","��","��","��"};
		String mid[]= {"��","��","��","��","��"};
		String name[] =new String[50];
		
		for (int i =0; i<name.length; i++) {
		Random rand = new Random();
		String la = (last[new Random().nextInt(last.length)]);
		String fi = (first[new Random().nextInt(first.length)]);
		String mi = (mid[new Random().nextInt(mid.length)]);
		String fullname = la + fi + mi;
		name[i] = fullname;
		System.out.printf("[%d]	 %s \n",i+1,fullname);
		}

		
	}

}
