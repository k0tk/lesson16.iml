package by.itstep.model.inheritance.empls;

public class EmplsTester {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("Bob");
//		e1.makeJob();
		e1.dance();
		
		Developer d1 = new Developer();
		d1.setName("John");
//		d1.makeJob();
//		d1.code();
		d1.dance();
		
		
		SenniorDeveloper sd1 = new SenniorDeveloper();
		sd1.setName("Bill");		
//		sd1.setLastName("Ivanov");
//		sd1.setAge(55);
//		sd1.setGender('M');
//		sd1.makeJob();
//		sd1.code();
//		sd1.setExp(5);
//		sd1.setCompanyName("IBM");
		sd1.dance();
		sd1.drink();
		
		
		JuniorDeveloper jd1 = new JuniorDeveloper();
		jd1.setName("Garry");
//		jd1.makeJob();
//		jd1.code();
		jd1.dance();
		
		MiddleDeveloper md1 = new MiddleDeveloper();
		md1.setName("Alex");
//		md1.makeJob();
//		md1.code();
		md1.dance();
		sd1.drink();
		
		TestDeveloper td1 = new TestDeveloper();
		td1.setName("George");
//		td1.makeJob();
//		td1.Testing();
		td1.dance();
		
		JuniorTestDeveloper jtd1 = new JuniorTestDeveloper();
		jtd1.setName("Mason");
//		jtd1.makeJob();
//		jtd1.Testing();
		jtd1.dance();
		
		Manager m1 = new Manager();
		m1.setName("Sveta");
//		m1.manegment();
		m1.dontDance();
		
		OrganizationManager om1 = new OrganizationManager();
		om1.setName("Tanya");
//		om1.manegment();
		om1.dance();
		
//		System.out.println(sd1.toString());
		
		Person p1 = new Person();
		p1.setName("Kostya");
//		p1.setLastName("Andreev");
//		p1.setAge(30);
//		p1.setGender('M');
//		System.out.println(p1.toString());
		p1.dance();
	}
	
}
