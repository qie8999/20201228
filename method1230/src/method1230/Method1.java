package method1230;

public class Method1 {

	public static void main(String[] args) {
		// ���� ���� 2�� �޼ҵ� ��
		System.out.println("func() ȣ����");
		func(); //2. �޼ҵ� ���(ȣ��) func�� �ִ� ������ �̵�
		//3. �ؿ����� �� �а� �ٽ� func���� ���ƿ�
		System.out.println("func() ȣ����");
		
		System.out.println("�ݺ��� �޼ҵ� ȣ��");
		for (int i=0; i<5; i++) {
			func();
		}
		

	}
	//1. �޼ҵ� ���� (����) 
	public static void func() {
		System.out.println("�޽�� ���");
		//���� �޼ҵ带 ����Ҽ� �ִ°� �ƴ�
		//�޼ҵ带 �ҷ� �־����
		

	}
}
