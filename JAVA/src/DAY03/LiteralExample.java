package DAY03;

public class LiteralExample {
	/*
	 * 이름 : 이종석
	 * 사는곳 : 서울 금천구
	 * 직장 : 서울 금천구
	 * "안녕하세요"
	 */
	
	public static void main(String[] args) {
		
		// 상수
		double pi = 3.14;
		pi = 3.15; // 변수이므로 값 변경 가능
		
		final double PI = 3.14;
		// PI = 3.15; -> 상수는 값 변경이 불가능
		// 상수는 선언 및 초기화 동시에 할 것
		
		
		// 리터럴은 \n, \t, \" 등 문자열을 출력, 저장하고 싶을때 사용하는 규칙
		
		System.out.println("이름 : 이종석");
		System.out.println("사는곳 : 서울 금천구");
		System.out.println("직장 : 서울 금천구");
		
		System.out.print("이름 : 이종석\n");
		System.out.print("사는곳 : 서울 금천구\n");
		System.out.print("직장 : 서울 금천구\n");
		
		System.out.print("\"안녕하세요\"");
		
					

	}

}
