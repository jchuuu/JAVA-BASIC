package DAY11Two;

// 웹 어플리케이션의 카운터
public class Counter { //->> method
		
	// static 키워드는 멤버변수, 메서드에 사용
	// 초기화에도 사용은 가능함
	
	int dynamicCounter = 0; // 인스턴스변수(객체변수) ->> heap
	static int staticCounter = 0; // 정적변수
	
	// 인스턴스메서드(객체메서드) = 동적
	public void plusDynamicCounter() {
		dynamicCounter++;
	}
	
	// 정적메서드 = 정적(MethodArea에 한번만 할당)
	public static void plusStaticCounter() {
		staticCounter++;
	}
	
}
