package method1230;

public class Method2 {

	public static void func() {
		System.out.println("func() ���");
		func1();
	}

	public static void func1() {
		System.out.println("func1() ���");
		func2();//�޼ҵ� �ȿ��� �ٸ� �޼ҵ� ȣ�Ⱑ��
		//�ٸ������� ������ �θ� ���� ����
	}

	public static void func2() {
		System.out.println("func2() ���");
		//�����ϰ� ȣ��Ǿ��� �������� ���ư�.
	}

	public static void main(String[] args) {
		// ������ ������ ����
		//�� ���߿� �������� ���ƿ�
		func();
		System.out.println("��� �޼ҵ� ����");
	}

}
