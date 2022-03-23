package by.itstep.client;

import by.itstep.model.Company;
import by.itstep.model.Employee;

public class main {

	public static void main(String[] args) {
		Company c1 = new Company();
		Company c2 = new Company();
		
		
		c1.setName("ItStep");
		
		System.out.println(c1.getName());
		
		
		c1.setType("IT");
		
		System.out.println(c1.getType());
		
		
		c1.setNumberOfEmrls(500);
		
		System.out.println(c1.getNumberOfEmrls());
		
		
		c1.setPhone("+375(29)54-54-544");
		
		System.out.println(c1.getPhone());
		
		
		c1.setBudget(100500);
		
		System.out.println(c1.getBudget());
		
		
		c1.setLocation("Minsk, K. Marksa 32");
		
		System.out.println(c1.getLocation());
	
		
		/////////////////////////////////////////
		
		
		c2.setName("GeekBrains");
		
		System.out.println(c2.getName());
		
		
		c2.setType("IT");
		
		System.out.println(c2.getType());
		
		
		c2.setNumberOfEmrls(100);
		
		System.out.println(c2.getNumberOfEmrls());
		
		
		c2.setPhone("+375(29)45-45-455");
		
		System.out.println(c2.getPhone());
		
		
		c2.setBudget(20000);
		
		System.out.println(c2.getBudget());
		
		
		c2.setLocation("Minsk");
		
		System.out.println(c2.getLocation());
		
		
		///////////////////////////////////////////////////
		
		
		Employee em = new Employee();
		Employee em1 = new Employee();
		Employee em2 = new Employee();
		
		
		em.setName("Bob");
		em.setId(51);
		em.setExp(4);
		em.setCompany(c1);
		
		System.out.println(em.getName());
		System.out.println(em.getId());
		System.out.println(em.getExp());
		System.out.println(em.getCompany().getLocation());
		
		
		
		
		
		
		
		
	}

}