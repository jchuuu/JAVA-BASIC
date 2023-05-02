package DAY03;

public class StringExample {

	public static void main(String[] args) {
		// 참조 데이터타입
		// 1. 클래스(객체)
		// 2. 변수 공간에 실제값이 아닌 reference(시작주소를 참조)
		// 대표적으로 String
		
		char alpha = '이'; // 문자는 싱글쿼테이션
		String name = "이종석"; // 문자열은 더블쿼테이션
		int intAlpha = alpha;
		
		System.out.println(alpha + " = " + intAlpha );
		System.out.println("내 이름은 " + name + "입니다");
				
	}

}
