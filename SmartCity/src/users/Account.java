package users;

import java.util.Objects;

public class Account {
	private String username;
	private String password;
	
	
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Account)) {
			return false;
		}
		Account other = (Account) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}


	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + "]";
	}
	
	
	
	
}
