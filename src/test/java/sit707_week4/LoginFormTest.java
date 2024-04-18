package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "223188749";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "KEMA SANKA SRINATH DISSANAYAKE GARUSINGHE ARACHCHIGE";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	/*
	 * Write more test functions below.
	 */
	
	@Test
	public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, "5545");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailWrongUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("kema", null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("kema", "5545");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("kema", "ahsan_pass");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "kema_pass");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
	public void testFailCorrectUsernameAndCorrectPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		LoginForm.validateCode(null);
		Assert.assertTrue( status.isLoginSuccess() == true );
    }
	
	@Test
	public void testFailCorrectUsernameAndCorrectPasswordAndWrongValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		LoginForm.validateCode("54321");
		Assert.assertTrue( status.isLoginSuccess() == true );
    }
	
	@Test
	public void testFailCorrectUsernameAndCorrectPasswordAndCorrectValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		LoginForm.validateCode("12345");
		Assert.assertTrue( status.isLoginSuccess() == true );
    }
	
	
}
