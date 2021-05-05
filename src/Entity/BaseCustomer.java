package Entity;

public class BaseCustomer {
	private String id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int numberOfCoffe;
	public BaseCustomer() {
		
	}
	public BaseCustomer(String id, String firstName, String lastName, String nationalityId,int numberOfCoffe) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.numberOfCoffe = numberOfCoffe;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getNumberOfCoffe() {
		return numberOfCoffe;
	}
	public void setNumberOfCoffe(int numberOfCoffe) {
		this.numberOfCoffe = numberOfCoffe;
	}

}
