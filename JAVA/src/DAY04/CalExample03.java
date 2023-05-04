package DAY04;

public class CalExample03 {

	public static void main(String[] args) {
		// 비교연산
		// 같다, 작다, 크다, 작거나 같다, 크거나 같다, 같지 않다
		// A = B -> A == B
		// A < B , A > B , A <= B, A >= B
		// A != B !는 not equal을 의미
		// 비교연산은 이항
		// 값 비교연산자 값 / 값 비교연산자 연산식 / 연산식 비교연산자 연산식
		
		int x = 10;
		int y = 20;
		int z = 3;
		
		boolean result = x>=y;
		boolean result2 = 10 == (x * 2 / y);
		boolean result3 = 10 != 1;
		
		System.out.println(x + " >= " + y + " = " + (x>=y));
		System.out.println(x + " >= " + y + " = " + result);
		System.out.println(result2);
		System.out.println(result3);
		
		// x는 2 이상, 20 미만인가요?
		// 2 <= x < 20  --> 에러
		boolean result4 = 2 <= x && x < 20;
		System.out.println(result4);
		
		int x1 = 10;
		int y1 = 20;
		boolean result5 = x1 > 10 && y1 <= 20 && y1 > x1;
		// false && true && true = false (AND)
		boolean result6 = x1 > 10 || y1 <= 20 || y1 > x1;
		// false || true || true = true (OR)
		boolean result7 = x1 > 10 ^ y1 <= 20 ^ y1 > x1;
		// false ^ true ^ true = false (XOR)
		boolean result8 = result5 ^ result6 || result7 && true;
		// false ^ ture || false && true
		
		
		
		

	}

}
