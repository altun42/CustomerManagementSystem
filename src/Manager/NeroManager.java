package Manager;


import Ýnterfaces.CustomerOperations;

public class NeroManager implements CustomerOperations {

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

}
