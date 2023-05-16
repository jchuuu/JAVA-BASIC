package DAY08;

public class MultipleArrayExample {

	public static void main(String[] args) {
		
		
		// 1. 1차원 배열
		// 1-1. 배열 선언
		int[] a;
		// 1-2. 선언과 방 만들기
		int[] a1 = new int[3];
		// 1-3. 선언과 동시에 방과 값 만들기
		int[] a2 = {1,2,3};
		
		// 2. 2차원 배열
		// 2-1. 선언
		int [][] b; //--> 층&방
		// 2-2. 선언과 방 만들기(2층 방3개)
		int[][] b1 = new int[2][3];
		// 2-3. 선언과 동시에 방과 값 만들기
		int[][] b2 = {{1,2,3},
					  {4,5,6}};
		
		// for문으로 2차원 배열 출력
		for(int i=0; i<b2.length; i++) { //층
			for(int k=0; k<b2[i].length ; k++) { //방
				System.out.println(b2[i][k]);
			}
			
		}
	}

}
