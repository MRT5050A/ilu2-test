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
	void testMoinsDeHuit() {
		assertFalse(pv.validate("abc"));
	}
	
	@Test
	void testPlusDe13() {
		assertFalse(pv.validate("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	void testAvecLettres() {
		assertFalse(pv.validate("abcdefghij"));
	}
	
	@Test
	void testAvecLettresEtChiffres() {
		assertFalse(pv.validate("12345678a"));
	}
	
	@Test
	void testAvecChiffres() {
		assertTrue(pv.validate("123456789"));
	}
	
}
