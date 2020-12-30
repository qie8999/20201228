package method1230;

public class Method3 {
	static int num = 200; //전역변수
	
	public static void func() {
		int num =100; //지역변수
		System.out.println("func()num: " + num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main()num :" + num);
		func();

	}

}
