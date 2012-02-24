package org.gambettinha.standards.nosideeffects;

public class NastyToRefactor {

	public void login(){
		User user = new User("jeff");
		checkPassword(user);
	}
	
	private boolean checkPassword(User user) { 
		User returnedUser = UserBD.findByName(user);
		if (returnedUser != null) {
			if ("Valid Password".equals(returnedUser.getPasswd()))
				Session.initialize();
				return true;
		}
		return false; 
	}
	
}