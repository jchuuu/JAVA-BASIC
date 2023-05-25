package DAY11;

public class Lee {

	public void sayMyName() {
		System.out.println("이종석입니다");
	}
	
	public void sayMotherName() {
		Mom mother = new Mom();
		mother.sayMyName();
	}
	
	void sayMyAge() {
		System.out.println(33);
	}
	
}
