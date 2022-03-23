package by.itstep.model;

//"'IS A' new relation ship		
public class Employee extends Person{
	
	    private int id;
	    private String lastName;
	    private String position;
	    private int exp;
	    private Company company; // Has a relation ship 
		private Address address;
	    
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public int getExp() {
			return exp;
		}

		public void setExp(int exp) {
			this.exp = exp;
		}

		public Company getCompany() {
			return company;
		}

		public void setCompany(Company company) {
			this.company = company;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		
	
	
	
	
	
	
	
	
	
	
	
	
	 
}
