package DAY08;

import java.util.Arrays;

public class ArrayCopyExample { //p133

	public static void main(String[] args) {
		
		// *** java 17 api documentation ***
		
		// 배열 복사가 없을 때;
		int a[] = {1,2};
		int b[] = a;
		
		b[1] = 100;
		System.out.println("a[1] : " + a[1]);
		
		// 1. for문을 활용한 복사
		int a1[] = {1,2};
		int b1[] = new int[a1.length];
		
		for(int x=0; x<a1.length; x++) {
			b1[x] = a1[x];
		}
		
		b1[1] = -1000;
		System.out.println("a1[1] : "+ a1[1]);
		
		
		// 2. System.arrayCopy();
		int a2[] = {1,2,3};
		int b2[] = new int[a2.length];
		System.arraycopy(a2,0,b2,0,a2.length);
		// 어떤배열을 어디서부터 대상배열을 어디서부터 어디까지 복사!
		
		System.out.println("arrayCopy로 복사");
		for(int x=0; x< b2.length; x++){
			System.out.println(b2[x]);
		}
		
		// Arrays.copyOf(null, 0);
		
		
		// *** 향상된 for문(for each문) ***
		System.out.println("향상된 for문 사용하여 배열 꺼내기");
		for(int val : b2) {
			System.out.println(val);
		}// b2에 있는 값들을 val에 복사!
		// arr.forEach(function(x) {console.log(x);}
		
	}

}
