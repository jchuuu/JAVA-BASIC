package DAY03;


public class VariableExample {

	public static void main(String[] args) {

		int   age; // 변수선언!
	//  자료형  변수명
		age = 40; // 변수 초기화(값 대입)
		
		int age2 = 20; // 선언과 동시에 초기화		
		// int age; 같은 이름의 변수를 또 선언할 수 없다(컴파일에러)
		
		// 변수를 사용한 부분 -->
		int ageSum = age + age2;
		System.out.println("age+age2=" + ageSum);
	
		// 자바 예약어는 변수명으로 쓸 수 없음
		// int if; 	int for;  int break;
		
		
	}
}
