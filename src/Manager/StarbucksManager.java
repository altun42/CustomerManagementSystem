package Manager;



import Entity.BaseCustomer;
import �nterfaces.BaseManager;
import �nterfaces.CustomerOperations;

public class StarbucksManager extends BaseManager implements CustomerOperations {
	
	BaseCustomer baseCustomer = new BaseCustomer();
	
			
	

	@Override
	public void add(String customer,String customer2,String customer3) {
		
		if (customer3.length()==11) {
			System.out.println(customer+" "+customer2+" ki�isinin kayd� yap�ld�...");
		}else {
			System.out.println(customer+" "+customer2+" ki�isinin kayd� yap�lamad�...");
		}
		
		
		
		
	}

	@Override
	public void delete(String customer,String customer2) {
		
		System.out.println(customer+" "+customer2+" ki�isinin kayd� silindi...");
	}

	@Override
	public void update(String customer,String customer2) {
		System.out.println(customer+" "+customer2+" ki�isinin kayd� g�ncellendi...");
		
	}

	@Override
	public void mernis(String customer) {
		
		if (customer.length()==11) {
			
			System.out.println("Kimlik do�ruland�");
			
		}else {
			System.out.println("Kimlik do�rulanamad�");
		}
		
		
	}

	@Override
	public void starAdd(int numberOfCoffe) {               
		int numberOfStar = numberOfCoffe;
		System.out.println(numberOfStar+ " tane y�ld�z kazand�n�z...");
		
	}

}
