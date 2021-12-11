package users;

public class Resident extends User{
	private int age;
	private String profession;
	private Address address;
	
	public Resident(String fullName, int ID, String email, String phoneNumber, Account account, int age, String profession) {
		super(fullName, ID, email, phoneNumber, account);
		this.age = age;
		this.profession = profession;
	}
	
	public Resident(String fullName, int ID, String email, String phoneNumber, Account account, int age, String profession,
			Address address) {
		super(fullName, ID, email, phoneNumber, account);
		this.age = age;
		this.profession = profession;
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Address getAddress() {
		return address;
	}
	public void setAdress(Address adress) {
		this.address = adress;
	}
	
	public String getApplianceStatus(String type) {
		return address.apartment.appliances.get(type).getStatus();
	}
	
	public void controlAppliance(String type) {
		address.apartment.appliances.get(type).Switch();
	}
	
//	public void reportProblemAppliance(Appliance appliance) {}
//	public void reportProblemSensor(Sensor sensor) {}
}