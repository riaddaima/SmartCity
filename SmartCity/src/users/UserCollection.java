package users;

import java.util.HashMap;
import java.util.Map;

public class UserCollection {
	public static Map<String, User> users = new HashMap<String, User>() {{
		put("admin", new GeneralAdmin("admin", 1, "admin@aui.ma", "+212600000000", new Account("admin", "admin")));
		put("riad", new Resident("riad", 2, "riad@aui.ma", "+212600000000", new Account("riad", "riad"), 20, "Software Engineer"));
	}};
	
	public static void addUser(User user) {
		if (!users.containsKey(user.getAccount().getUsername()))
			users.put(user.getAccount().getUsername(), user);
	}
	
	public static void removeUser(String username) {
		if (users.containsKey(username)) {
			users.remove(username);
		}
	}
	
	public static User authenticate(String username, String password) throws InvalidCredentialsException {
		if (users.containsKey(username)) {
			if (users.get(username).getAccount().getPassword().equals(password)) {
				return users.get(username);
			} else {
				throw new InvalidCredentialsException(username);
			}
		}
		throw new InvalidCredentialsException(username);
	}
}
