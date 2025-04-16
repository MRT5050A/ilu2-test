package ilu2;

import java.util.Iterator;

public class PasswordValidator {

	String[] chocking;

	public PasswordValidator() {
		chocking = new String[] { "666" };
	}

	public PasswordValidator(String[] chockingList) {
		chocking = chockingList;
	}

	public boolean validate(String password) {
		return !isEmpty(password) && isGoodLength(password) && isOnlyDigit(password) && !isChocking(password);
	}

	public boolean validate(String password, String birthDate) {
		if (isBirthDateIn(password, birthDate)) {
			return false;
		}
		return validate(password);
	}

	private boolean isChocking(String password) {
		for (int i = 0; i < chocking.length; i++) {
			if (password.contains(chocking[i])) {
				return true;
			}
		}
		return false;
	}

	private boolean isBirthDateIn(String password, String birthDate) {
		return (password.contains(birthDate));
	}

	private boolean isEmpty(String password) {
		return password == null || password.isEmpty();
	}

	private boolean isGoodLength(String password) {
		return password.length() > 8 && password.length() < 13;
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
