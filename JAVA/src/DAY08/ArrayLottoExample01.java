package DAY08;

public class ArrayLottoExample01 {

	public static void main(String[] args) {
		// lotto 6/45
		// lotto 6/x
		
		//System.out.println(args[0]);
		
		// 1. 1 ~ 1000까지의 숫자 중 6개를 선택하는 로또 프로그램을 만든다
		// 2. x/y 예를 들면 java ArrayLottoExample 10 100
		// 1~100까지의 수에서 10개를 뽑아서 출력
		
		if(args.length == 0 || args.length > 2) {
			System.out.println("사용법 : java ArrayLottoExample <뽑을수> <최대숫자>");
			return;
		}
		
		int pickCount = Integer.parseInt(args[0]);
		int maxNum = Integer.parseInt(args[1]);
		
		
		int[] lotto = new int[pickCount]; // 로또 숫자는 6개
		for(int x=0 ; x<lotto.length; x++) {
			// 랜덤한 값을 넣는다
			int num = (int)(Math.random() * maxNum) + 1;
			lotto[x] = num;			
		}		
		
		System.out.println("생성된 로또 번호");
		for(int x=0; x<lotto.length; x++) {
			System.out.print(lotto[x] + "\t");
		}
		
		System.out.println("\n프로그램을 종료합니다");
			
	}
	
	
}
