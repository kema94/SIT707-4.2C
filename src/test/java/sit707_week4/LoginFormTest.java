package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author KEMA SANKA SRINATH DISSANAYAKE GARUSINGHE ARACHCHIGE
 */
public class LoginFormTest 
{
	//Test cases for login scenarios 

	@Test
	public void testStudentIdentity() {
		String studentId = "223188749";
		Assert.assertNotNull("Student ID is", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "KEMA SANKA SRINATH DISSANAYAKE GARUSINGHE ARACHCHIGE";
		Assert.assertNotNull("Student name is", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPassword()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
		
	@Test
	public void testFailEmptyEmailAndWrongPassword()
    {
		LoginStatus status = LoginForm.login(null, "5545");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailWrongUsernameAndEmptyPassword()
    {
		LoginStatus status = LoginForm.login("xyz@gmail.com", null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailWrongEmailAndWrongPassword()
    {
		LoginStatus status = LoginForm.login("xyz@gmail.com", "kema_pass");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailWrongEmailAndCorrectPassword()
    {
		LoginStatus status = LoginForm.login("xyz@gmail.com", "1234");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailCorrectEmailAndEmptyPassword()
    {
		LoginStatus status = LoginForm.login("kema@gmail.com", null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailCorrectEmailAndWrongPassword()
    {
		LoginStatus status = LoginForm.login("kema@gmail.com", "8768");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }	
	
	@Test
	public void testFailCorrectEmailAndCorrectPassword()
    {
		LoginStatus status = LoginForm.login("kema@gmail.com", "1234");
		Assert.assertTrue( status.isLoginSuccess() == true );
    }
	
	
	
	
}
