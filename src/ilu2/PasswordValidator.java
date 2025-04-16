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
			if (password.length()<8 || password.length()>13) {
				return false;
			}
			else {
				if (isOnlyDigit(password)) {
					return true;
				} else return false;
			}
		}
	}
	
	
	
	private boolean isOnlyDigit(String password) {
		try {
			Integer.parseInt(password);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
