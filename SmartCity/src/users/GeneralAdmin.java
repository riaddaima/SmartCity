package users;

import smartStreet.SmartStreet;
import smartStreet.SmartStreetCollection;

public class GeneralAdmin extends User {

	public GeneralAdmin(String fullName, int ID, String email, String phoneNumber, Account account) {
		super(fullName, ID, email, phoneNumber, account);
	}
	
//	public void addBlg(Building blg) {
//		
//	}
	
	public SmartStreet addStreet(String streetName) {
		return SmartStreetCollection.addSmartStreet(streetName);
	}
	
//	public void addApt(Apartment apt) {}
	
//	public void addSensor(SensorNode sensor) {
//		SensorNodeCollection.addSensor(sensor);
//	}
	
	public void createAccount(User user) {
		UserCollection.addUser(user);
	}
	
	public void deleteAcc(User user) {
		UserCollection.removeUser(user.getAccount().getUsername());
	}
	
	public void updateUsername(User user, String newUsername, String password) {
		UserCollection.users.get(user.getAccount().getUsername()).changeUsername(newUsername, password);
	}
	
	public void updatePassword(User user, String oldPassword, String newPassword, String confirmation) {
		UserCollection.users.get(user.getAccount().getUsername()).changePassword(oldPassword, newPassword, confirmation);
	}
	
//	public void handleRport() {}
	

	@Override
	public String toString() {
		return "{" +
			"}";
	}


}
