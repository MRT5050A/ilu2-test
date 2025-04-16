package ilu2;

public class PasswordValidator {
	
	
	public PasswordValidator() {
		return ;
	}

	public boolean validate(String password) {
		if (password == null || password.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}
}
