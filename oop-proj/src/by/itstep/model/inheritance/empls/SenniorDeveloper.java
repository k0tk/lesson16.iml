package by.itstep.model.inheritance.empls;

public class SenniorDeveloper extends Developer{
	
	@Override
	public void code() {
		playTennis();
		System.out.println("Writing very good code,but sometimes it's doesn't work" );
	}
	
	public void playTennis() {
		System.out.println("playTennnis()");
	}
}
