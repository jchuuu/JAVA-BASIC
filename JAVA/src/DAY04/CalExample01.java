package DAY04;

public class CalExample01 {

	public static void main(String[] args) {
		// 1. 대입연산 ; 좌측에 있는 공간에 우측에 있는 값을 할당(대입)
		// 왼쪽에는 변수/상수, 오른쪽에는 변수/값/수식
		
			int a = 10;
			a = 15;
			int b = a + 3;
			
		// 2. 산술연산 ;
		
			int x = 10;
			int y = 20;
			int z = (x + y) * 10 / 20; // 연산자의 우선순위는 인간과 똑같음
			
			int x1 = 10;
			int y1 = 20;
			int z1 = x1 * y1;
			
			System.out.println(x1 + " x " + y1 + " = " + z1);
		
			int x2 = 10;
			int z2 = x2 / 2;
			System.out.println(x2 + " / 2 = " + z2);
			
			int x3 = 10;
			int y3 = 7;
			System.out.println(x3 + " % " + y3 + " = "  + (x3 % y3));
		
	}

}
