package Manager;


import �nterfaces.CustomerOperations;

public class NeroManager implements CustomerOperations {

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

}
