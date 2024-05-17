package testspractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringUtilsTest {
	@ParameterizedTest
	@ValueSource(strings = { "radar", "kayak", "no lemon, no melon", "Madam, I'm Adam.", "I did, did I?",
			"Eva, can I see bees in a cave?", "Don't nod" })
	void is_palindrome_correct_parameterized(String candidate) {
		assertTrue(StringUtils.isPalindrome(candidate));
	}

	@ParameterizedTest
	@ValueSource(strings = { "hello", "world" })
	void is_palindrome_incorrect_parameterized(String candidate) {
		assertFalse(StringUtils.isPalindrome(candidate));
	}

	@Test
	void is_punctuation_cleared() {
		assertEquals("dontradar", StringUtils.clearPunctuation("?don't rad,ar?"));
		assertEquals("evacaniseebeesinacave", StringUtils.clearPunctuation("Eva, can I see bees in a cave?"));
	}

	@Test
	void is_word_reversed() {
		assertEquals("radar", StringUtils.reverse("radar"));
		assertEquals("kayak", StringUtils.reverse("kayak"));
		assertEquals("hello", StringUtils.reverse("olleh"));
		assertEquals("world", StringUtils.reverse("dlrow"));
		assertEquals("no lemon, no melon", StringUtils.reverse("nolem on ,nomel on"));
	}
}
