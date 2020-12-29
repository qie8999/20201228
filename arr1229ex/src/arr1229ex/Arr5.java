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
		String last[] = {"김","박","이","최","장"};
		String first[]= {"바","사","아","자","차"};
		String mid[]= {"가","나","다","라","마"};
		String fullname[] =new String[50];
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("--------------------------");
			System.out.println("파일 제어 프로그램 v1.1");
			System.out.println("--------------------------");
			System.out.println("1. 이름 생성하여 파일에 저장하기");
			System.out.println("2. 파일에서 이름 읽어오기");
			System.out.println("3. 프로그램 종료");
			System.out.println("--------------------------");
			
			System.out.print("메뉴 선택 : ");
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
					str = "파일 생성 및 쓰기 예제입니다...";
					bs.write(fullname[i].getBytes());
					bs.close();
					//작업하다 오류가 발생한 경우 catch가 잡아준다
				} catch (FileNotFoundException e) {					
					e.printStackTrace();				
				} catch (IOException e) {					
					e.printStackTrace();
				}
				
				System.out.println("이름 생성하여 파일에 저장하기");
				break;
			case 2:
				BufferedReader br;
				try {
				br=new BufferedReader(
						new FileReader(new File("d:/test1.txt")));
				String str2=br.readLine();
				System.out.println("---파일에서 내용 읽어오기---");
				System.out.println(str2);
				br.close();
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("파일에서 이름 읽어오기");
				break;
			case 3:
				System.out.println("프로그램 종료!");
				s.close();
				System.exit(0);
			}
		}
	}

}
