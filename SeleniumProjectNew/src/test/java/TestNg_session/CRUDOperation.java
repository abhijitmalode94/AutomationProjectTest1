package TestNg_session;

import org.testng.annotations.Test;

public class CRUDOperation {
	
	
	public void createUser() {
		System.out.println("create user");
		
	}
	

	public void getUser() {
		System.out.println("get user");
	}
	

	public void updateUser() {
		System.out.println("Update user");
	}
	

	public void deleteUser() {
		System.out.println("deleted user");
		
	}
	
	
	@Test
	public void createUserTest() {
		createUser();
		
	}
	
	
	@Test
	public void getUserTest() {
		createUser();
		getUser();
		
	}
	
	
	@Test
	public void updateUserTest() {
		createUser();
		getUser();
		updateUser();
		getUser();
		
	}
	

	@Test
	public void deletUserTest() {
		createUser();
		getUser();
		updateUser();
		getUser();
		deleteUser();
		
		
	}


}
