package users;

import smartStreet.*;

public class GeneralAdmin extends User {

	public GeneralAdmin(String fullName, int iD, String email, String phoneNumber) {
		super(fullName, iD, email, phoneNumber);
	}
	
//	public void addBlg(Building blg) {
//		
//	}
	
//	public void addStreet(SmartStreet street) {
//		SmartStreetCollection.addStreet(street);
//	}
	
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
	
}
