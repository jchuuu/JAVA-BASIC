package DAY07;

public class LoopKeywordExample {

	public static void main(String[] args) {
		// loop문(반복문)에서 사용되는 keyword(p106)
		// break
		// continue
		
		// break
		// 1부터 100까지의 합이 400을 넘으면 출력하지 않는 프로그램
		int sum = 0;
		
		for(int i=1 ; i<=100 ; i++) {
			
			sum += i;
			if(sum > 400) {break;}
		}
			System.out.println("총합 : " + sum);
	
		
		// continue
		// 반복문에만 존재
		// 짝수만 출력
		for(int x=1; x<=100; x++) {
			if(x % 2 != 0) {
				continue;
			}
			System.out.println(x);
		}
		
		
		// while문으로 바꿔보기
		int x = 1; // 할당
		while(x<=100) {
			x++; // 증감
			if(x % 2 != 0) {
				continue;
			} // 비교
			System.out.println(x);
		}
	
		
			
		}
}