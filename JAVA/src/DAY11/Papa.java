package DAY11;

public class Papa {
	// class는 protected가 안됌
	
	// public int walletBalance = 30000; // 지갑에 들어있는 돈
	private int walletBalance = 30000;
	
	public void SayMyName() {
		System.out.println("난 Lee의 아빠야");
	}
	
	/* protected int money() {
		return 1000;
	} */
	
	public int money() {
		
		if(walletBalance < 25000) {
			System.out.println("돈없어");
			return 0;
		}
		int num = 1000;
		walletBalance -= num;
		System.out.println(">> 여기있다 용돈 " + num + "원");
		
		return num;
	}
	
	protected int give() {
		int cash = walletBalance;
		walletBalance = 0;
		return walletBalance;
	}
	
	void cleaning() {
		System.out.println("집안 청소 쓱쓱쓱");
	}
}
