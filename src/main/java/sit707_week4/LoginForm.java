package sit707_week4;

/**
 * Authenticates user based on email, password.
 * @author KEMA SANKA SRINATH DISSANAYAKE GARUSINGHE ARACHCHIGE
 */
public class LoginForm {
	private static String EMAIL = "kemasanka981@gmail.com";
	private static String PASSWORD = "1234";

	public static LoginStatus login(String email, String password) {
		if (email == null || email.length()==0) 
			return new LoginStatus(false, "Empty Email");
		
		if (password == null || password.length()==0) 
			return new LoginStatus(false, "Empty Password");
		
		if (!email.equals(EMAIL)) 
			return new LoginStatus(false, "email mismatch");
		
		if (!password.equals(PASSWORD)) 
			return new LoginStatus(false, "Credential mismatch");
		
		return new LoginStatus(true, "Login Succesfull");
	}
	
	
}
