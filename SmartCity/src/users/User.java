package users;

import java.util.Objects;

public class User {
	private String fullName;
	private int ID;
	private String email;
	private String phoneNumber;
	private Account account;
	
	
	public User(String fullName, int iD, String email, String phoneNumber) {
		this.fullName = fullName;
		ID = iD;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	



	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		return ID == other.ID && Objects.equals(email, other.email) && Objects.equals(fullName, other.fullName)
				&& Objects.equals(phoneNumber, other.phoneNumber);
	}


	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", ID=" + ID + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
//	public viewData();
	
	public void changePassword(String oldPassword, String newPassword, String confirmation) {
		if (oldPassword.equals(account.getPassword()) && newPassword.equals(confirmation)) {
			account.setPassword(newPassword);
		}
	}
	
	public void changeUsername(String newUsername, String password) {
		if (account.getPassword().equals(password)) {
			account.setUsername(newUsername);
		}
	}
	
}
