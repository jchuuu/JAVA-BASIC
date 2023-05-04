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
		

		// 증감연산
		int y = 1;
		y++; // y = y+1
		System.out.println("y = "+y);
		y--; // y = y-1
		System.out.println("y = "+y);
		++y;
		--y;
				
		// 증감연산이 앞에 있거나 뒤에 있거나 값은 같음
		// 프로그램 실행 순서에는 차이가 있음
		int z = 10;
		
		// 선&후 수식에 따라 나타나는 차이점
		//System.out.println("z = " + (++z)); =====> 11
		System.out.println("z = " + (z++)); // ====> 10
		System.out.println(z); // =================> 11
		
	}

}
