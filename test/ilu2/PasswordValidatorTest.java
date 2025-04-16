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
	
	@Test
	void testDateDeNaissance() {
		assertFalse(pv.validate("66631122000", "31122000"));
	}
	
	@Test
	void testSansDateDeNaissance() {
		assertTrue(pv.validate("123456789", "31122000"));
	}
	
	@Test
	void test666In() {
		assertFalse(pv.validate("1234566678"));
	}
	
	@Test
	void testChocking2() {
		String[] chocking = {"666", "1789"};
		pv = new PasswordValidator(chocking);
		assertFalse(pv.validate("1280801789"));
	}
}
