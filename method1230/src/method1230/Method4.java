package method1230;

public class Method4 {

	public static void main(String[] args) {
		int num = 10;//�߰�ȣ�� ����� ���� �������		
		func(num);//()�ȿ� ���ڸ� �ְų� �������� ���� �� �ִ�.
		//or��ȯ���� �����ϴ� �޼ҵ带 ������� �� �ִ�.
		//�Ű������� 10����
		System.out.println("main() num : " + num);

	}
//�Ű� 10�� �����´�
	public static void func(int num) {// ���������� ����
		num = num + 1;//�Ű����� ���� ���
		System.out.println("func() num : " + num);
	}
}
