package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
	
	PasswordValidator pv;
	
	@BeforeEach
	void init() {
		pv = new PasswordValidator();
	}

	@Test
	void testNull() {
		assertFalse(pv.validate(null));
	}
	
	@Test
	void testVide() {
		assertFalse(pv.validate(""));
	}

	
	@Test
	void testPlein() {
		assertTrue(pv.validate("motdepasse"));
	}
}
