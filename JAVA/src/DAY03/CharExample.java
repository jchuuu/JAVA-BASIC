package DAY03;

public class CharExample {

	public static void main(String[] args) {
		
		char alpha = 97;
		byte x = 127; // byte x = 128;(x)
		float f = 1.0f; // 실수는 타입을 정해주어야 함
		
		System.out.println(alpha);
		
		// 정수의 기본형은 int
		// 실수의 기본형은 double
		
		char alpha2 = 65;
		int ascii = 0;
		
		for(int i=0; i<26; i++) {
			alpha2 = (char)(alpha2+i);
			ascii = alpha2;
			System.out.println("문자 : " + alpha2 + "는 ASCII CODE " + ascii + " 입니다" );
		}
	}

}
