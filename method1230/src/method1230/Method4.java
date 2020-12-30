package method1230;

public class Method4 {

	public static void main(String[] args) {
		int num = 10;//중괄호를 벗어나면 값이 사라진다		
		func(num);//()안에 숫자를 넣거나 변수값을 넣을 수 있다.
		//or반환값이 존재하는 메소드를 집어넣을 수 있다.
		//매개변수로 10전달
		System.out.println("main() num : " + num);

	}
//매개 10이 내려온다
	public static void func(int num) {// 지역변수와 동일
		num = num + 1;//매개변수 먼저 사용
		System.out.println("func() num : " + num);
	}
}
