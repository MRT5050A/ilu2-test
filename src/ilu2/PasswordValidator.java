package ilu2;

public class PasswordValidator {
	
	
	public PasswordValidator() {
		return ;
	}

	public boolean validate(String password) {
		if (!isEmpty(password)) {
			if (isGoodLength(password)) {
				if (isOnlyDigit(password)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean validate(String password, String birthDate) {
		if (isBirthDateIn(password, birthDate)) {
			return false;
		}
		return validate(password);
	}
	
	private boolean isBirthDateIn(String password, String birthDate) {
		return (password.contains(birthDate));
	} 
	
	private boolean isEmpty(String password) {
		return password == null || password.isEmpty();
	}
	
	private boolean isGoodLength(String password) {
		return password.length()>8 && password.length()<13;
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
