package DAY07;

public class ArrayExample {

	public static void main(String[] args) {
		
		// 1. 선언과 공간할당을 따로
		// 배열 선언
		int odd[];
		// 초기화
		odd = new int[4];
		
		// 선언과 동시에 초기화
		int odd2[] = new int[4];
		int a[][][] = new int [3][100][3];
		
		// 2. 각 방에 값을 넣어주기
		odd[0] = 1;
		odd[1] = 3;
		odd[2] = 5;
		odd[3] = 7;
		
		// 3. 선언과 동시에 방을 생성하면서 값까지 넣어주는 방법
		int odd3[] = {1,3,5,7};
		for(int i=0; i<odd3.length; i++) {
			System.out.println(odd3[i]);
		}
		
		// 10개짜리 방을 만들고 홀수 채우기
		int[] odd4 = new int[10];
		int idx = 0; // 배열의 호실
		for(int x=1; x<=odd4.length; x++) {	
			System.out.println("배열의 "+ x + "idx(호실) : " + idx);
			odd4[idx++]=x;			
		}		
		
		idx = 0; // 배열의 호실
		for(int x=1; x<=100; x++) {	
			
			if(idx > 9) {
				break;
			}
					
			if(x % 2 == 0) {
					continue;
				}
			System.out.println("배열의 idx(호실) : " + idx + "/ 값 :  " + x);
			odd4[idx++]=x;			
		}
				
		
	}
}
