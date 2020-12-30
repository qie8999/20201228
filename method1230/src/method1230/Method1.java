package method1230;

public class Method1 {

	public static void main(String[] args) {
		// 위의 것은 2번 메소드 형
		System.out.println("func() 호출전");
		func(); //2. 메소드 사용(호출) func이 있는 곳으로 이동
		//3. 밑에까지 다 읽고 다시 func으로 돌아옴
		System.out.println("func() 호출후");
		
		System.out.println("반복문 메소드 호출");
		for (int i=0; i<5; i++) {
			func();
		}
		

	}
	//1. 메소드 정의 (선언) 
	public static void func() {
		System.out.println("메쏘드 사용");
		//아직 메소드를 사용할수 있는게 아님
		//메소드를 불러 주어야함
		

	}
}
