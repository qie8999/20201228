package arr1229ex;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Arr5 {

	public static void main(String[] args) {
		String last[] = {"��","��","��","��","��"};
		String first[]= {"��","��","��","��","��"};
		String mid[]= {"��","��","��","��","��"};
		String fullname[] =new String[50];
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("--------------------------");
			System.out.println("���� ���� ���α׷� v1.1");
			System.out.println("--------------------------");
			System.out.println("1. �̸� �����Ͽ� ���Ͽ� �����ϱ�");
			System.out.println("2. ���Ͽ��� �̸� �о����");
			System.out.println("3. ���α׷� ����");
			System.out.println("--------------------------");
			
			System.out.print("�޴� ���� : ");
			int menu = s.nextInt();
			

			switch (menu) {
			case 1:
				for(int i=0; i<50; i++) {
					fullname[i]=last[(int)(Math.random()*5)] +
							mid[(int)(Math.random()*5)]+
							first[(int)(Math.random()*5)];
					//System.out.println(fullname[i]);
					
				}
				BufferedOutputStream bs = null;
				String str=null;
				try {
					String filename;
					bs = new BufferedOutputStream(

							new FileOutputStream(filename));
					str = "���� ���� �� ���� �����Դϴ�...";
					bs.write(fullname[i].getBytes());
					bs.close();
					//�۾��ϴ� ������ �߻��� ��� catch�� ����ش�
				} catch (FileNotFoundException e) {					
					e.printStackTrace();				
				} catch (IOException e) {					
					e.printStackTrace();
				}
				
				System.out.println("�̸� �����Ͽ� ���Ͽ� �����ϱ�");
				break;
			case 2:
				BufferedReader br;
				try {
				br=new BufferedReader(
						new FileReader(new File("d:/test1.txt")));
				String str2=br.readLine();
				System.out.println("---���Ͽ��� ���� �о����---");
				System.out.println(str2);
				br.close();
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("���Ͽ��� �̸� �о����");
				break;
			case 3:
				System.out.println("���α׷� ����!");
				s.close();
				System.exit(0);
			}
		}
	}

}
