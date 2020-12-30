package method1230;

public class Method5 {

	public static void divide(int num1, int num2) {
		//num1 분자/num2 분모
		if(num2 == 0) {//if(!num2)
			System.out.println("0으로 나눌 수 없습니다.");
			//void method에서 return을 사용하면 메소드 종료
			return; //system.exit();와 동일한 효과(프로그램강제종료)
		}  //return은 현재 메소드 탈출
		System.out.println("나눗셈 결과 : " +(num1/num2));
	}
	
	public static void main(String[] args) {
		divide(4,2);
		divide(4,0);
		System.out.println("메인()종료");
		

	}

}
