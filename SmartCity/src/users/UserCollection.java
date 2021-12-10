package users;

import java.util.HashMap;
import java.util.Map;

public class UserCollection {
	public static Map<String, User> users = new HashMap<String, User>();
	
	public static void addUser(User user) {
		if (!users.containsKey(user.getAccount().getUsername()))
			users.put(user.getAccount().getUsername(), user);
	}
	
	public static void removeUser(String username) {
		if (users.containsKey(username)) {
			users.remove(username);
		}
	}
	
	public static boolean authenticate(String username, String password) {
		return users.containsKey(username) && users.get(username).getAccount().getPassword().equals(password);
	}
	
	
}
