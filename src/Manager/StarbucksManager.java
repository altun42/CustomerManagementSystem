package Manager;



import Entity.BaseCustomer;
import Ýnterfaces.BaseManager;
import Ýnterfaces.CustomerOperations;

public class StarbucksManager extends BaseManager implements CustomerOperations {
	
	BaseCustomer baseCustomer = new BaseCustomer();
	
			
	

	@Override
	public void add(String customer,String customer2,String customer3) {
		
		if (customer3.length()==11) {
			System.out.println(customer+" "+customer2+" kiþisinin kaydý yapýldý...");
		}else {
			System.out.println(customer+" "+customer2+" kiþisinin kaydý yapýlamadý...");
		}
		
		
		
		
	}

	@Override
	public void delete(String customer,String customer2) {
		
		System.out.println(customer+" "+customer2+" kiþisinin kaydý silindi...");
	}

	@Override
	public void update(String customer,String customer2) {
		System.out.println(customer+" "+customer2+" kiþisinin kaydý güncellendi...");
		
	}

	@Override
	public void mernis(String customer) {
		
		if (customer.length()==11) {
			
			System.out.println("Kimlik doðrulandý");
			
		}else {
			System.out.println("Kimlik doðrulanamadý");
		}
		
		
	}

	@Override
	public void starAdd(int numberOfCoffe) {               
		int numberOfStar = numberOfCoffe;
		System.out.println(numberOfStar+ " tane yýldýz kazandýnýz...");
		
	}

}
