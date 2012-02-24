package org.gambettinha.standards.nosideeffects;

public class Refactored {

	public void loginAndInitializeSection(){
		User user = new User("jeff");
		checkPassword(user);
		Session.initialize();
	}
	
	private boolean checkPassword(User user) { 
		User returnedUser = UserBD.findByName(user);
		if (returnedUser != null) {
			if ("Valid Password".equals(returnedUser.getPasswd()))
				return true;
		}
		return false; 
	}

}