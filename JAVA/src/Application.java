
import DAY11.Lee;
import DAY11.Papa;

public class Application extends Papa{
	// 접근제한자
	// Lee/Mom/Papa/Application.java
	
	public static int wallet = 0;
	
	public static void main(String[] args) {
		
		Lee a = new Lee();
		a.sayMyName();
		// a.sayMyAge();
		a.sayMotherName();
			
		// Mom m = new Mom();
		
		Papa f = new Papa();
		f.SayMyName(); // public은 누구나 호출 가능
		wallet += f.money();
		wallet += f.money();
		wallet += f.money();
		wallet += f.money();
		wallet += f.money();
		wallet += f.money();
		wallet += f.money();
		wallet += f.money();
		
		System.out.println("지갑에는 " + wallet + "원이 있어요");
		
		//f.money(); // 상속관계에서만 호출 가능
		// f.cleaning(); // 동일 패키지 안에서만 호출 가능
		
		//new Application().money();// 가능
		//new Application().cleaning(); // 상속관계에서도 불가
	
		
		// public이기 때문에 누구든 값을 변경할 수 있는 상태
		// f.walletBalance = 1000;
		// System.out.println("아빠 지갑에는 " + f.walletBalance + "원이 있어요");
		
		// private이 되면 변경 불가능
		
		
		
	}
}
