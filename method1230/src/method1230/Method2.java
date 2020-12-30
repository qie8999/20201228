package method1230;

public class Method2 {

	public static void func() {
		System.out.println("func() 사용");
		func1();
	}

	public static void func1() {
		System.out.println("func1() 사용");
		func2();//메소드 안에서 다른 메소드 호출가능
		//다른곳에서 메인을 부를 수는 없음
	}

	public static void func2() {
		System.out.println("func2() 사용");
		//종료하고 호출되어진 이전으로 돌아감.
	}

	public static void main(String[] args) {
		// 무조건 시작은 메인
		//맨 나중에 메인으로 돌아옴
		func();
		System.out.println("모든 메소드 종료");
	}

}
