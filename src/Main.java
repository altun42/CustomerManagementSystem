import Entity.BaseCustomer;
import Manager.NeroManager;
import Manager.StarbucksManager;


public class Main {

	public static void main(String[] args) {
		BaseCustomer customer1 = new BaseCustomer("1","Kerim","Altun","14879569100",5);
		
		StarbucksManager operations = new StarbucksManager();
		operations.mernis(customer1.getNationalityId());
		operations.add(customer1.getFirstName(), customer1.getLastName(),customer1.getNationalityId());
		operations.starAdd(customer1.getNumberOfCoffe());
		
		BaseCustomer customer2 = new BaseCustomer("2", "Mehmet", "Yýlmaz", "12345678910", 4);
		NeroManager operations2 = new NeroManager();
		operations2.add(customer2.getFirstName(),customer2.getLastName(),customer2.getNationalityId());
		
		
		
		

	}

}
