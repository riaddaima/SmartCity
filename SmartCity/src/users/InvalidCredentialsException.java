package users;

public class InvalidCredentialsException extends Exception {
  public String username;

  public InvalidCredentialsException(String username) {
    super(String.format("Invalid credentials for %s", username));
    this.username = username;
  }
}
