package by.itstep.model.inheritance.empls;

public class Developer extends Employee{
	
	@Override
	public String toString() {
		
		return super.toString() + " Name: "+ getName() +", lastName: " + getLastName() + ", position: " + getPosition() + 
		", exp: " + getExp() + ", company: " + getCompanyName();
	}
	
	public void code() {
		System.out.println(" write some code...");
	}	
	
}