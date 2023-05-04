package DAY04;

public class CalExample02 {

	public static void main(String[] args) {
		// 확장판 대입연산
		
		int x = 10;
		x = x + 10; // x -> 20
		x += 10; // -> x = x + 10
		
		System.out.println(x);
		
		x = x - 10;
		x -= 10;
		
		System.out.println(x);
		
		x *= 10; // x = x * 10
		System.out.println(x);
		x /= 10; // x = x / 10
		System.out.println(x);
		x %= 3; // x = x % 3
		System.out.println(x);
		

	}

}
