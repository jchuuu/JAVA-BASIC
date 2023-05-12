package DAY07;

public class ForExample {

	public static void main(String[] args) {
		
		// 1~100까지 출력
		for(int i=0; i<=100; i++) {
			System.out.println(i);			
		}
		
		// for문 내부의 값들(초기화;비교;증감)
		// 부분은 필수가 아님
		
		int i = 1;
		for(;i<=100;i++) {
			System.out.println(i);
		}
		
		for(;i<=100;) {
			System.out.println(i++);
		}
		
		//for(;;) {
		//	System.out.println(i);
		//} 무한루프
		

	}

}
