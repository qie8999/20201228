package method1230;

public class Method5 {

	public static void divide(int num1, int num2) {
		//num1 ����/num2 �и�
		if(num2 == 0) {//if(!num2)
			System.out.println("0���� ���� �� �����ϴ�.");
			//void method���� return�� ����ϸ� �޼ҵ� ����
			return; //system.exit();�� ������ ȿ��(���α׷���������)
		}  //return�� ���� �޼ҵ� Ż��
		System.out.println("������ ��� : " +(num1/num2));
	}
	
	public static void main(String[] args) {
		divide(4,2);
		divide(4,0);
		System.out.println("����()����");
		

	}

}
