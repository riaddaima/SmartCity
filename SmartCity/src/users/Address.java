package users;
import smartStreet.SmartStreet;
import smartBuilding.SmartBuilding;
import smartBuilding.Apartment;

public class Address {

	SmartStreet street;
	SmartBuilding building;
	Apartment apartment;
	
	public Address(SmartStreet street, SmartBuilding building, Apartment apartment) {
		this.street = street;
		this.building = building;
		this.apartment = apartment;
	}
	
	
}
