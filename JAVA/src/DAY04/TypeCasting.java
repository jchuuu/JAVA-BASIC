package DAY04;

public class TypeCasting {
	
	public static void main(String args[]) {

		// 묵시적(자동) 형변환
		short x = 10;
		
		// 명시적(강제) 형변환 ; 작은크기자료형 = (작은크기자료형)큰크기자료형
		// short y = 40000;
		   short y = (short)40000;
		   
		   System.out.println("x="+x);
		   System.out.println("y="+y);
		 		 		
	}
}

