package DAY07;

public class MultipleExample {

	public static void main(String[] args) {
		// 구구단
		// 2단
		for(int i=1; i<10 ; i++){
			System.out.println("2 x " + i + " = " + 2*i);
		}
		
		for(int i=2; i<10 ; i++){
			System.out.println("===== "+ i + "단 =====" );
			for(int k=1 ; k<10; k++) {
			System.out.println(i +" x " + k + " = " + (i*k));
		}
		}
		
		
	}

}
